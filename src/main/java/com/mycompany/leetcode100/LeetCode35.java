/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode100;

/**
 *
 * @author safoz
 */
public class LeetCode35 {
    
    public int searchInsert(int[] nums, int target) {
        
        int index = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target) {
                index = i;
                break;
            } else if (nums[i] > target) {
                index = i;
                break;
            } else if (i == nums.length - 1) {
                index = i + 1;
            }
        }
        
        return index;
    }
}
