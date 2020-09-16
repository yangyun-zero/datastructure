package com.yangyun;

import com.yangyun.commonality.arrays.AbstractList;

/**
 * @ClassName ChainList
 * @Description: 链表
 * @Author yun.Yang
 * @Date 2020/9/15 22:30
 * @Version 1.0
 **/
public class ChainList<E> extends AbstractList<E> {

    private int size;

    private Node first;

    private Node last;

    public Boolean add(E e) {
        Node<E> l = last;
        Node<E> newNode = new Node<E>(e, null);
        last = newNode;
        if (l == null){
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }

    public void add(int index, E e) {

    }

    public Boolean remove(E e) {
        return null;
    }

    public E removeIndex(int index) {
        return null;
    }

    public Boolean set(int index, E e) {
        return null;
    }

    public E get(int index) {
        return null;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int indexOf(E e) {
        return 0;
    }

    public void clear() {

    }

    @Override
    public String toString() {
        for (int i = 0; i < size; i++){

        }
        return super.toString();
    }

    private class Node<E> {

        E element;

        Node<E> next;

        public Node (E element, Node<E> next){
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
