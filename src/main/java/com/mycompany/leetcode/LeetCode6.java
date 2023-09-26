/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode;

/**
 *
 * @author safoz
 */
public class LeetCode6 {

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
        System.out.println(convert(s, 4));
        System.out.println(convert(s, 5));

    }

    public static String convert(String s, int numRows) {

        String result = "";
        String addResult = "";
        boolean outOfBounce = false;
        int addIndexForSubstring = 0;
        int numRowLength = numRows;

        for (int i = 0; i <= numRowLength; i++) {
            outOfBounce = false;
            System.out.println("--Generiere " + (i + 1) + ". Array--");

            int j = addIndexForSubstring;
            System.out.println(j);
            if (numRowLength + 1 == addIndexForSubstring) {
                while (j < s.length()) {
                    addResult = addResult + s.charAt(j);
                    System.out.println(addResult);
                    j = j + numRows - 1;
                }
                addIndexForSubstring++;
                numRows = numRows - 1;
                result = result + addResult;
            } else {
                numRows = numRowLength;
                while (j < s.length()) {
                    addResult = addResult + s.charAt(j);
                    System.out.println(addResult);
                    j = j + numRows + numRows - 2;
                }
            }

        }

        return result;
    }
}
