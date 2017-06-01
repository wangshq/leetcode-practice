package wangshq.a2017_4;

import java.util.Stack;

/**
 * 逆波兰表示法
 * ReversePolishNotation
 * @author wangshq
 * @version 1.0
 * 
 * 
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are+,-,*,/. Each operand may be an integer or another expression.
Some examples:
 * 
 *   ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 */
public class ReversePolishNotation {
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < tokens.length; i++) {
        	int a1;
        	int a2;
            switch (tokens[i]) {
                case "+":
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a1+a2);
                    break;
                case "-":
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a2-a1);
                    break;
                case "*":
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a1*a2);
                    break;
                case "/":
                    a1 = stack.pop();
                    a2 = stack.pop();
                    stack.push(a2/a1);
                    break;
                default:
                    stack.push(Integer.valueOf(tokens[i]));
                    break;
            }
            
        }
        return stack.pop();
    }
}
