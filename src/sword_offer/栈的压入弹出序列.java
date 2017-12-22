/*
 * @(#)栈的压入弹出序列.java 2017年8月11日下午4:06:52
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sword_offer;

import java.io.UnsupportedEncodingException;

/**
 * 栈的压入弹出序列
 * @author wangshq
 * @version 1.0
 *
 * 
输入两个整数序列，
第一个序列表示栈的压入顺序，
请判断第二个序列是否为该栈的弹出顺序。

假设压入栈的所有数字均不相等。

例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */


public class 栈的压入弹出序列 {
    public static void main(String[] args) throws UnsupportedEncodingException{
        byte [] b= new byte[]{(byte) 0xcc,(byte) 0xe1,(byte) 0xbd,(byte) 0xbb};
        String s = new String(b,"ISO8859-1");  
        System.out.println(s);  
        print(s.getBytes("ISO8859-1"));  
        print(s.getBytes("GBK"));  
        print(s.getBytes("UTF-16"));  
        System.out.println(new String(s.getBytes("ISO8859-1"),"utf-8"));  
          
        String ss = "中文";  
        print(ss.getBytes("UTF-16"));  
        print(ss.getBytes("ISO8859-1"));  
    }  
      
    static void print(byte [] b){  
        for(byte _b : b){  
            String s = Integer.toHexString(_b&0xff);  
            if(s.length()==1){  
                s = "0"+s;  
            }  
            System.out.print(s + " ");  
        }  
        System.out.println();  
    } 
}
