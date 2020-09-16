package com.yangyun.commonality.arrays;

/**
 * @author yangyun
 * @Description:
 * @date 2020/9/16 9:46
 */
public interface List<E> {

    Boolean add(E e);

    void add(int index, E e);

    Boolean remove(E e);

    E removeIndex(int index);

    Boolean set(int index, E e);

    E get(int index);

    Boolean isEmpty();

    int size ();

    int indexOf(E e);

    void clear();
}
