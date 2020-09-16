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
        Node<E> newNode = new Node<E>(e, null, l);
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
        checkIndex(index);

        return node(index).element;
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
        StringBuilder sb = new StringBuilder("size = ");
        sb.append(size);
        sb.append(", [");
        Node c = first;
        for (int i = 0; i < size; i++){
            if (i != 0){
                sb.append(",");
            }
            sb.append(c.element);
            c = c.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private void checkIndex (int index){
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException("Array Index Out Of Exception，Current Size : " + size + ", Target Size: " + index);
        }
    }

    private Boolean isElementIndex(int index){
        return index >= 0 && index < size;
    }

    Node<E> node (int index){
        // from head loop
        if (index < size >> 1){
            Node<E> x = first;
            for (int i = 0; i < index; i++){
                x = x.next;
            }
            return x;
        } else {
            // from tail loop
            Node<E> x = last;
            return x;
        }
    }

    private class Node<E> {
        /** 存储的元素 **/
        E element;

        /** 下一个节点 **/
        Node<E> next;
        /** 上一个节点 **/
        Node<E> prve;

        public Node (E element, Node<E> next, Node<E> prve){
            this.element = element;
            this.next = next;
            this.prve = prve;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
