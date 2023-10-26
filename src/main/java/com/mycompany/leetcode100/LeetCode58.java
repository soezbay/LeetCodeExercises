/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode100;

/**
 *
 * @author safoz
 */
public class LeetCode58 {

    public static int lengthOfLastWord(String s) {

        if (s.contains(" ")) {
            String result = "";
            char c = ' ';
            String s1 = s.stripTrailing();
            
            for (int i = s1.length() - 1; i != 0; i--) {
                if (s1.charAt(i) == c) {
                    System.out.println(result);
                    return result.length();
                } else {
                    result = s1.charAt(i) + result ;
                }
            }
        } else {
            return s.length();
        }
        
        return s.trim().length();
    }
}
