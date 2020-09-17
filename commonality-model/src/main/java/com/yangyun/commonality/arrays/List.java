package com.yangyun.commonality.arrays;

/**
 * @author yangyun
 * @Description:
 * @date 2020/9/16 9:46
 */
public interface List<E> {

    /**
     * 功能描述: TODO 添加元素
     * @Param: [e]
     * @Return: java.lang.Boolean
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:29
     */
    Boolean add(E e);

    /**
     * 功能描述: TODO 添加元素到指定位置
     * @Param: [index, e]
     * @Return: void
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:29
     */
    void add(int index, E e);

    /**
     * 功能描述: TODO 移除元素
     * @Param: [e]
     * @Return: java.lang.Boolean
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:30
     */
    Boolean remove(E e);

    /**
     * 功能描述: TODO 移除指定位置元素
     * @Param: [index]
     * @Return: E
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:30
     */
    E removeIndex(int index);

    /**
     * 功能描述: TODO 替换指定位置元素
     * @Param: [index, e]
     * @Return: java.lang.Boolean
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:30
     */
    E set(int index, E e);

    /**
     * 功能描述: TODO 获取元素
     * @Param: [index]
     * @Return: E
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:30
     */
    E get(int index);

    /**
     * 功能描述: TODO 是否为空
     * @Param: []
     * @Return: java.lang.Boolean
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:31
     */
    Boolean isEmpty();

    /**
     * 功能描述: TODO 数组大小
     * @Param: []
     * @Return: int
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:31
     */
    int size ();

    /**
     * 功能描述: TODO 获取元素第一次出现下标
     * @Param: [e]
     * @Return: int
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:31
     */
    int indexOf(E e);

    /**
     * 功能描述: TODO 清空数组
     * @Param: []
     * @Return: void
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:31
     */
    void clear();

    /**
     * 功能描述: TODO 是否包含
     * @Param: []
     * @Return: java.lang.Boolean
     * @Author: yun.Yang
     * @Date: 2020/9/17 9:32
     */
    Boolean Contains(E e);
}
