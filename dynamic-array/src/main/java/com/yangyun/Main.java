package com.yangyun;


/**
 * @author yangyun
 * @Description:
 * @date 2020/9/4 9:36
 */
public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3, 9);

        System.out.println(list);
    }
}
