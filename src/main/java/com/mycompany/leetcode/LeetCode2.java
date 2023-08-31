/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.leetcode;

/**
 *
 * @author safoz
 */
public class LeetCode2 {

    public static void main(String[] args) {
        
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        
        System.out.println(addTwoNumbers(l1, l2).toString());

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode resultList = new ListNode(0);
        ListNode p = l1; 
        ListNode q = l2;
        ListNode current = resultList;
        
        int x = 0;
        int y = 0;
        int sum = 0;
        int result = 0;
        
         while (p != null || q != null) {
            x = (p != null) ? p.val : 0;
            y = (q != null) ? q.val : 0;
            sum = result + x + y;
            result = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null){
                q = q.next;
            }
        }
        
        if (result > 0) {
            current.next = new ListNode(result);
        }
        
        return resultList.next;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
