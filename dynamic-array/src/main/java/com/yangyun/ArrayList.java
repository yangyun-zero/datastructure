package com.yangyun;

/**
 * @author yangyun
 * @Description: 动态数组
 * @date 2020/9/1 9:16
 */
public class ArrayList<E> {

    /**
     * 功能描述: TODO 元素个数
     */
    private int size;

    private final int DEFAULT_CAPACITY = 10;

    /**
     * 功能描述: TODO 数组大小
     */
    private int length;

    private Object elementData[];

    public ArrayList (){
        new ArrayList(DEFAULT_CAPACITY);
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
        elementData[size++] = e;
        return true;
    }

    public void add(int index, E e){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index:" + index + ", size：" + size);
        }
        ensureCapacityInternal(size + 1);
        for (int i = size; index <= i ; i--){
            elementData[i] = elementData[i -1];
        }
        elementData[index] = e;
        size++;
    }

    public E remove(E e){
        return null;
    }

    public E removeIndex(int index){

        return null;
    }

    public E set(int index, E e){

        return null;
    }

    public E get(int index){

        return null;
    }

    public Boolean isEmpty(){

        return false;
    }

    public int size (){
        return size;
    }

    public int indexOf(E e){
        if(e == null){
            return -1;
        }

        return -1;
    }

    public void clear(){

    }

    private void ensureCapacityInternal(int minCapacity){
        if (length < minCapacity){
            grow();
        }
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
