/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode100;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author safoz
 */
public class LeetCode3 {

    public static void main(String[] args) {
        
        String s = "";
        String s1 = " ";
        System.out.println(s.length());
        System.out.println(s1.length());

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("abb"));
        

    }

    public static int lengthOfLongestSubstring(String s) {

//        ArrayList<Character> charList = new ArrayList<>();
//
//        for (char c : s.toCharArray()) {
//            charList.add(c);
//        }
//
//        Iterator<Character> iterator = charList.iterator();
//        String z = "";
//        while (iterator.hasNext()) {
//            char c = iterator.next();
//            char c2 = iterator.next();
//            
//            if(c == c2) {
//                z = "";
//            } else {
//                z = z + c;
//            }
//        }
        
        if(!(s.length() < 2)) {
            String z = "";
            String z2 = "";
            for (int i = 0; i < s.length(); i++) {
                String x = s.charAt(i) + "";
                boolean contains = false;
                for (int j = i + 1; j < s.length() - i && !contains ; j++) {
                    
                    String y = s.charAt(j) + "";

                    if (!z.contains(y)) {
                        z += y;
                    } else if (z.contains(y) && z.length() >= z2.length()) {
                        z2 = z;
                        z = "";
                        contains = true;
                    } else {
                        z = "";
                        contains = true;
                    }
                }
            }
            return z2.length();
        } else {
            return s.length();
        } 
    }
}
