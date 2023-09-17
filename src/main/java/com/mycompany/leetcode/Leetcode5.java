/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode;

/**
 *
 * @author safoz
 */
public class Leetcode5 {

    public static void main(String[] args) {

        String s = "babad";
        String s1 = "abbc";

        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("abbc"));

    }

//    public static String longestPalindrome(String s) {
//        
//        String palindrom = "";
//        if (s.length() == 1) {
//            return s;
//        } else {
//
//            for (int i = 0; i < s.length(); i++) {
//
//                char anfang = s.charAt(i);
//                boolean sameLetter = false;
//
//                for (int j = s.length() - 1; !sameLetter; j--) {
//                    if (anfang == s.charAt(j)) {
//                        palindrom = s.substring(i, j);
//                        s = palindrom;
//                        sameLetter = true;
//
//                        if (palindrom.length() == 3) {
//                            i = s.length();
//                        }
//                    }
//                }
//            }
//        }
//        return palindrom;
//    }
    public static String longestPalindrome(String s) {

        String result = "";
        int resultLength = 0;

        switch (s.length()) {
            case 0 -> {
                return "";
            }
            case 1 -> {
                return s;
            }
            default -> {
                for (int i = 0; i < s.length(); i++) {
                    // Suche nach Palindromen mit s.charAt(i) als Zentrum
                    String palindromeOdd = expandAroundCenter(s, i, i);
                    String palindromeEven = expandAroundCenter(s, i, i + 1);

                    // Wähle das längere Palindrom
                    if (palindromeOdd.length() > resultLength) {
                        result = palindromeOdd;
                        resultLength = palindromeOdd.length();
                    }
                    if (palindromeEven.length() > resultLength) {
                        result = palindromeEven;
                        resultLength = palindromeEven.length();
                    }
                }
            }
        }
        return result;
    }
    
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Das gefundene Palindrom geht von left+1 bis right-1
        return s.substring(left + 1, right);
    }

}
