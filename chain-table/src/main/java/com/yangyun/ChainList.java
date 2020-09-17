package com.yangyun;

import com.yangyun.commonality.arrays.AbstractList;

/**
 * @ClassName ChainList
 * @Description: 双向链表
 * @Author yun.Yang
 * @Date 2020/9/15 22:30
 * @Version 1.0
 **/
public class ChainList<E> extends AbstractList<E> {

    private int size;

    private Node first;

    private Node last;

    public Boolean add(E e) {
        lastLink(e);
        return true;
    }

    public void add(int index, E e) {
        checkPositionIndex(index);
        if (index == size){
            lastLink(e);
        } else {
            firstLink(e, node(index));
        }
    }

    public Boolean remove(E e) {
        if (e == null){
            Node<E> c = first;
            for (int i = 0; i < size; i++){
                if (c.element == null){
                    unBinderLink(c);
                    return true;
                }
                c = c.next;
            }
        } else {
            Node<E> c = first;
            for (int i = 0; i < size; i++){
                if (e.equals(c.element)){
                    unBinderLink(c);
                    return true;
                }
                c = c.next;
            }
        }
        return false;
    }

    public E removeIndex(int index) {
        checkIndex(index);
        E e = node(index).element;
        remove(e);
        return e;
    }

    public E set(int index, E e) {
        checkIndex(index);
        Node<E> node = node(index);
        E old = node.element;
        node.element = e;
        return old;
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
        if (e == null){
            Node<E> c = first;
            for (int i = 0; i < size; i++){
                if (c.element == null){
                    return i;
                }
                c = c.next;
            }
        } else {
            Node<E> c = first;
            for (int i = 0; i < size; i++){
                if (e.equals(c.element)){
                    return i;
                }
                c = c.next;
            }
        }
        return -1;
    }

    public void clear() {
        if (first != null){
            Node<E> c = first;
            for (int i = 0; i < size; i++){
                Node<E> n = c.next;
                c.element = null;
                c.prve = null;
                c.next = null;
                c = n;
            }
            size = 0;
            first = last = null;
        }
    }

    public Boolean Contains(E e) {
        return null;
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

    /**
     * 功能描述: TODO 移除指定元素
     * @Param: [old]
     * @Return: void
     * @Author: yun.Yang
     * @Date: 2020/9/17 11:43
     */
    private void unBinderLink(Node<E> old){
        Node<E> prve = old.prve;
        if (prve == null){
            first = old.next;
        } else {
            prve.next = old.next;
        }
        size--;
    }

    /**
     * 功能描述: TODO 从链表后面添加
     * @Param: [e]
     * @Return: void
     * @Author: yun.Yang
     * @Date: 2020/9/17 10:45
     */
    private void lastLink(E e){
        Node<E> l = last;
        Node<E> newNode = new Node<E>(e, null, l);
        last = newNode;
        if (l == null){
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    /**
     * 功能描述: TODO 从链表尾部前添加
     * @Param: [e, c]
     * @Return: void
     * @Author: yun.Yang
     * @Date: 2020/9/17 10:46
     */
    private void firstLink (E e, Node<E> c){
        Node<E> prve = c.prve;
        Node<E> newNode = new Node<E>(e, c, c.prve);
        if (prve == null){
            first = newNode;
        } else {
            prve.next = newNode;
        }
        size++;
    }

    private void checkIndex (int index) {
        if (!isElementIndex(index)) {
            indexOutOfBoundsException(index);
        }
    }

    /**
     * 功能描述: TODO 添加元素时
     * @Param: [index]
     * @Return: void
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:42
     */
    private void checkPositionIndex (int index){
        if (!checkPositionIndexValid(index)){
            indexOutOfBoundsException(index);
        }
    }

    private Boolean checkPositionIndexValid (int index){
        return index >= 0 && index <= size;
    }

    private void indexOutOfBoundsException(int index){
        throw new IndexOutOfBoundsException("Array Index Out Of Exception，Current Size : " + size + ", Target index: " + index);
    }

    /**
     * 功能描述: TODO 获取元素时
     * @Param: [index]
     * @Return: java.lang.Boolean
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:41
     */
    private Boolean isElementIndex(int index){
        return index >= 0 && index < size;
    }

    // 双向链表获取元素的循环次数最多，size >> 1 - 1
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
            for (int i = size -1; i > index; i--){
                x = x.prve;
            }
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
