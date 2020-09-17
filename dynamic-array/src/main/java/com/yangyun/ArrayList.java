package com.yangyun;

import com.yangyun.commonality.arrays.AbstractList;

/**
 * @author yangyun
 * @Description: 动态数组
 * @date 2020/9/1 9:16
 */
public class ArrayList<E> extends AbstractList<E> {

    /**
     * 功能描述: TODO 元素个数
     */
    private int size;

    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 功能描述: TODO 数组大小
     */
    private int length;

    private Object elementData[];

    public ArrayList (){
        this(DEFAULT_CAPACITY);
    }

    public ArrayList (int initialCapacity){
        int capacity = this.length = initialCapacity < DEFAULT_CAPACITY ? DEFAULT_CAPACITY : initialCapacity;
        this.elementData = new Object[capacity];
    }

    /**
     * 功能描述: TODO 添加元素
     * @see java.util.ArrayList#add
     */
    public Boolean add(E e){
        // 是否需要扩容
        ensureCapacityInternal(size + 1);
        this.elementData[size++] = e;
        return true;
    }

    /**
     * 功能描述: TODO 添加元素到指定位置
     * @see ArrayList
     */
    public void add(int index, E e){
        rangeCheckForAdd(index);
        ensureCapacityInternal(size + 1);
        for (int i = size; index <= i ; i--){
            elementData[i] = elementData[i -1];
        }
        elementData[index] = e;
        size++;
    }

    public Boolean remove(E e){
        if (e == null){
            for (int index = 0; index < size; index++){
                if (elementData[index] == null){
                    removeIndex(index);
                    return true;
                }
            }
        }  else {
            for (int index = 0; index < size; index++){
                if (e.equals(elementData[index])){
                    removeIndex(index);
                    return true;
                }
            }
        }
        return false;
    }

    public E removeIndex(int index){
        rangeCheck(index);
        E old = (E)elementData[index];
        for (int i = index; index < size; index++){
            elementData[i] = elementData[i + 1];
        }

        elementData[--size] = null;
        return old;
    }

    public E set(int index, E e){
        rangeCheck(index);
        E old = (E)elementData[index];
        elementData[index] = e;
        return old;
    }

    public E get(int index){
        rangeCheck(index);
        return (E)elementData[index];
    }

    public Boolean isEmpty(){

        return size == 0;
    }

    public int size (){
        return size;
    }

    public int indexOf(E e){
        if (e == null){
            for (int index = 0; index < size; index++){
                if (elementData[index] == null){
                    return index;
                }
            }
        }  else {
            for (int index = 0; index < size; index++){
                if (e.equals(elementData[index])){
                    return index;
                }
            }
        }
        return -1;
    }

    public void clear(){
        if (size > 0){
            for (int i = 0; i < size; i++){
                elementData[i] = null;
            }
            size = 0;
        }
    }

    public Boolean Contains(E e) {
        if (e == null){
            for (int i = 0; i < size; i++){
                if (elementData[i] == null){
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++){
                if (e.equals(elementData[i])){
                    return true;
                }
            }
        }
        return false;
    }

    private void ensureCapacityInternal(int minCapacity){
        if (length < minCapacity){
            grow();
        }
    }

    /**
     * 功能描述: TODO index 下标越界检查
     */
    private void rangeCheck(int index){
        if (index < 0 || index >= size){
            indexOutOfBoundsMsg(index);
        }
    }

    private void rangeCheckForAdd(int index){
        if (index < 0 || index > size){
            indexOutOfBoundsMsg(index);
        }
    }

    private void indexOutOfBoundsMsg (int index){
        throw new IndexOutOfBoundsException("index:" + index + ", size：" + size);
    }

    /**
     * 功能描述: TODO 扩容 系数 1.5, 没有做最大容量限制
     */
    private void grow(){
        int newCapacity = length = length + (length >> 1);
        Object[] newElement = new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newElement[i] = elementData[i];
        }
        elementData = newElement;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                    numMoved);
        elementData[--size] = null; // clear to let GC do its work
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size = ").append(size).append(", [");
        for (int i = 0; i < size; i++){
            if (i != 0){
                sb.append(",");
            }
            sb.append(elementData[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
