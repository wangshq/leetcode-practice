/*
 * @(#)排列组合.java 2017年11月16日下午3:33:25
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package 编程之美;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全排列
 * @author wangshq
 * @version 1.0
 *
 */
public class 排列组合 {
    
    List<String[]> ad = new ArrayList<>();
    public static void main(String[] args) {
        String[] aStrings = {"1","3","4","6","11"};
        String[] okStrings = {};
        pailiezuhe(0,okStrings,aStrings);
    }
    
    /**
     * 
     */
    private static void pailiezuhe(int index,String[] okStrings,String[] noOkStrings) {
        if(noOkStrings.length == 0){
            return;
        }
        if(index == noOkStrings.length-1){
        }
    }
}
