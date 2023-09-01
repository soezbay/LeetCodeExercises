/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode;

import java.util.HashSet;
import javax.xml.stream.events.Characters;

/**
 *
 * @author safoz
 */
public class LeetCode20 {

    public static void main(String[] args) {

        String s = "";
        String s1 = " ";
        System.out.println(s.length());
        System.out.println(s1.length());

    }

    public static boolean isValid(String s) {

        boolean isValid = false;
        HashSet<Character> uniqueCharacters = new HashSet<>();
        uniqueCharacters.add('(');
        uniqueCharacters.add(')');
        uniqueCharacters.add('{');
        uniqueCharacters.add('}');
        uniqueCharacters.add('[');
        uniqueCharacters.add(']');

        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length() && !isValid; i++) {
                char x = s.charAt(i);

                for (int j = i + 1; j < s.length(); j++) {
                    char y = s.charAt(j);
                    if (y == x) {
                        contain
                    } else {

                    }
                }
            }
        } else {
            isValid = false;
        }

        return isValid;
    }
}
