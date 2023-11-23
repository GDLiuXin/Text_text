package com.practise;

import java.util.Scanner;
/*假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？*/
public class day70 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.climbStairs(4));
    }
}
class Solution1 {
    public int climbStairs(int n) {
        int a = 1, b = 1 , sum;
        for(int i = 0; i<n-1;i++){
            sum = a + b;
            a = b ;
            b = sum;
        }
        return b;
    }
}