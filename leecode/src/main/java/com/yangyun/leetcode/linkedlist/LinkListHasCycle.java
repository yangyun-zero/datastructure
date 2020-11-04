package com.yangyun.leetcode.linkedlist;

/**
 * @Description: 链表是否有环 <h>https://leetcode-cn.com/problems/linked-list-cycle/</h>
 * @Author yun.Yang
 * @Date 2020/11/3 20:19
 * @Version 1.0
 **/
public class LinkListHasCycle {

    public static void main(String[] args) {
        LinkListHasCycle t = new LinkListHasCycle();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l2;

        System.out.println(t.hasCycle(l1));

    }

    /**
     * 功能描述: 判断一个链表有环，使用快慢指针的方式，慢指针每次前进一步，快指针每次前进两步，如果存在环，那么在某个 node 上他们会相遇，说明有环
     * @param head：
     * Return: boolean
     * Author: yun.Yang
     * Date: 2020/11/3 20:28
     * @see ChainList
     */
    public boolean hasCycle (ListNode head){
        if (head == null || head.next == null){
            return false;
        }

        // 快慢指针的方式 slow 慢指针 fast 快指针
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
