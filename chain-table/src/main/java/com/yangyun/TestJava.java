package com.yangyun;

/**
 * @ClassName TestJava
 * @Description:
 * @Author yun.Yang
 * @Date 2020/9/21 22:37
 * @Version 1.0
 **/
public class TestJava {

    public static void main(String[] args) {
        TestJava t = new TestJava();
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

        System.out.println(t.reverseList2(l1));
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = null;
        while(head != null){
            ListNode n = head.next;
            head.next = node;
            node = head;
            head = n;
        }

        return head;
    }
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return node;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }


}
