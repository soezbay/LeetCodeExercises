/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.leetcode100;

import java.util.Arrays;

/**
 *
 * @author safoz
 */
public class LeetCode1 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{2, 7, 11, 15};
        int[] arr2 = new int[]{145, 5, 5, 15};
        int[] arr3 = new int[]{-2, 14, 11, 30};
        
        System.out.println(Arrays.toString(twoSum(arr1, 9)));
        System.out.println(Arrays.toString(twoSum(arr2, 10)));
        System.out.println(Arrays.toString(twoSum(arr3, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        boolean found = false;

        for (int i = 0; i < nums.length && !found; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (target == sum) {
                    arr[0] = i;
                    arr[1] = j;
                }
                found = target == sum;
            }
        }

        return arr;
    }
;
}
