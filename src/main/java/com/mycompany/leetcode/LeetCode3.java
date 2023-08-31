/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode;

/**
 *
 * @author safoz
 */
public class LeetCode3 {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {

        int result = 0;
        String z = "";
        String z2 = "";
        for (int i = 0; i != s.length() - 1; i++) {
            String x = s.charAt(i) + "";
            String y = s.charAt(i + 1) + "";
            z2 = z2 + x; 

            if (!z.contains(x)) {
                z = z + x;
            } else if (!z.contains(x) && z2.length() > z.length()) {
                z = z2;
            } else {
                z2 = "";
            }
        }
        System.out.println(z);
        System.out.println(z2);

        return z.length();
    }
}
