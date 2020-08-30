package com.yangyun;

/**
 * @ClassName ComplexRate
 * @Description: 复杂度：
 *                    0 1 2 3 4 5 ... n
 *          斐波那契数（0 1 1 2 3 5 ... n）后一位数等于前两位数的和
 * @Author 86155
 * @Date 2020/8/30 17:01
 * @Version 1.0
 **/
public class ComplexRate {

    /**
     * @Author yangyun
     * @Description:  n 表示的累计加n次
     * @Date 2020/8/30 17:04
     * @Param [n]
     * @returnm int
     **/
    //O(2ⁿ)
    public static int fib1(int n){
        if (n <=1 ) return n;
        return fib1(n- 1) + fib1(n -2);
    }

    // O(n)
    public static int fib2(int n){
        int first = 0, second = 1;
        for (int i = 0; i < n -1; i++){
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(fib2(60));
    }
}
