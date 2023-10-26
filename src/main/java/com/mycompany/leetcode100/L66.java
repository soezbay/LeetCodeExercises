/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode100;

import java.util.Arrays;

/**
 *
 * @author safoz
 */
public class L66 {

    public static int[] plusOne(int[] digits) {

        //last index of digits-arr
        int index = digits.length - 1;
        
        //check if last index is below 9, if true then we only need to add +1 to last index
        if (digits[index] != 9)
        {
            digits[index] = digits[index] + 1;
            return digits;
        } else if (digits.length == 1 && digits[index] == 9) { // check if digits-arr has only one element
            return new int[]{1,0};
        }
        
        //check the amount of nines from the last index
        for (int i = digits.length - 1; i >= 0; i--)
        {
            //check if loop ended and if there is only nines then we create
            //new arr with the first index beeing 1 and the trailing indexes will be automatically 0
            if (digits[i] == 9 && i == 0)
            {
                int[] result1 = new int[digits.length + 1];
                result1[0] = 1;
                System.out.println("result1 index: " + Arrays.toString(result1));
                return result1;
                
            //if the digit has something other than 9 we take the index where the loop ended
            } else if (digits[i] != 9) {
                index = i;
                System.out.println(index);
                break;
            } 
        }
        
        //create new arr to copy the digits-arr until index is reached
        int[] result2 = new int[digits.length];
        for (int i = 0; i <= index; i++)
        {        
            result2[i] = digits[i];    
            if(index == i) {
                result2[i] = digits[i] + 1;
            }
            
        }
        System.out.println(Arrays.toString(result2));

        return result2;

    }
}
