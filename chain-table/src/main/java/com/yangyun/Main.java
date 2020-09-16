package com.yangyun;

import com.yangyun.commonality.arrays.List;

/**
 * @author yangyun
 * @Description:
 * @date 2020/9/16 10:53
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ChainList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println(list.size());
        list.get(6);
    }
}
