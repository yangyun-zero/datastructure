package com.yangyun.leetcode.linkedlist;

/**
 * @Description: 反转一个链表 <h>https://leetcode-cn.com/problems/reverse-linked-list/<h/>
 * @Author yun.Yang
 * @Date 2020/11/3 19:56
 * @Version 1.0
 **/
public class ReverseLinkList {

    public static void main(String[] args) {
        ReverseLinkList t = new ReverseLinkList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        System.out.println(t.reverseListForRecursion(l1));
    }

    /**
     * 功能描述: 递归的方式反转一个链表
     * @param head：头节点
     * Return: com.yangyun.leetcode.linkedlist.ListNode
     * Author: yun.Yang
     * Date: 2020/11/3 20:09
     */
    public ListNode reverseListForRecursion (ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode node = reverseListForRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return node;

    }

    /**
     * 功能描述: 循环的方式反转一个链表
     * @param head：
     * Return: com.yangyun.leetcode.linkedlist.ListNode
     * Author: yun.Yang
     * Date: 2020/11/3 20:17
     */
    public ListNode reverseListForCirculation (ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode node = null;

        while (head != null){
            ListNode n = head.next;
            head.next = node;
            node = head;
            head = n;
        }
        return node;
    }
}
