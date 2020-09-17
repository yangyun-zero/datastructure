package com.yangyun;

import com.yangyun.commonality.arrays.List;

import java.util.LinkedList;

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
//        System.out.println(list);
//        System.out.println(list.size());
//        list.add(4, "e");
//        System.out.println(list);

        list.add("e");

//        list.remove("e");
        System.out.println(list.Contains("e"));

//        String s = list.removeIndex(1);
//        System.out.println(s);
//        System.out.println(list);
//        System.out.println(list.indexOf("ee"));

//        LinkedList<String> s = new LinkedList<String>();
//        s.add("a");
//        s.add("b");
//        s.add("c");
//        System.out.println(s);
//        s.add(0, "e");
//        System.out.println(s);
    }
}
