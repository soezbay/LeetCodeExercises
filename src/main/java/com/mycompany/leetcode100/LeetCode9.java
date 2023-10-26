/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode100;

/**
 *
 * @author safoz
 */
public class LeetCode9 {

    public static void main(String[] args) {


        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(20));


    }

    public static boolean isPalindrome(int x) {

        String k = Integer.toString(x);
        int length = k.length();
        boolean isPalindrom = true;

        for (int i = 0; i < k.length() && isPalindrom; i++) {
            if (k.charAt(i) != k.charAt(length - 1)) {
                isPalindrom = false;
            } else {
                length--;
            }
        }

        return isPalindrom;
    }

}


