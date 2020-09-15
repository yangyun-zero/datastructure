package com.yangyun;

/**
 * @ClassName ChainList
 * @Description: 链表
 * @Author yun.Yang
 * @Date 2020/9/15 22:30
 * @Version 1.0
 **/
public class ChainList<E> {

    private int size;

    private Node first;

    private Node last;

    private class Node<E> {

        E element;

        Node<E> next;

        Node<E> last;

        Node (E element, Node<E> next, Node<E> last){
            this.element = element;
            this.next = next;
            this.last = last;
        }
    }
}
