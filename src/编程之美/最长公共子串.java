/*
 * @(#)最长公共子串.java 2017年9月8日下午5:17:05
 * leetcode
 * Copyright 2017 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package 编程之美;

import java.util.Iterator;

/**
 * 最长公共子串
 * @author wangshq
 * @version 1.0
 *
 */
public class 最长公共子串 {
    
    public static void main(String[] args) {
        getMaxStr("asdjklajsdbsdf","111lajsdb222");
    }
    /**
     * 暴力解法 – 所得即所求
     */
    private static void getMaxStr(String str1 , String str2) {
        char[] c1s = str1.toCharArray();
        char[] c2s = str2.toCharArray();
        
        int maxlength = 0;
        int start1 = -1;
        int start2 = -1;
        
        long length1 = str1.length();
        long length2 = str2.length();
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                
                int maxlength1 = 0;
                int ii = i;
                int jj = j;
                
                while(ii<length1 && jj<length2 && c1s[ii] == c2s[jj]){
                    ii++;
                    jj++;
                    maxlength1++;
                }
                
                if(maxlength1>maxlength){
                    maxlength = maxlength1;
                    start1 = i;
                    start2 = j;
                }
            }
        }
        System.out.println(str1.substring(start1, start1+maxlength));
    }
}
