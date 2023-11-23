package com.practise;

public class day1 {
    public static void main(String[] args) {
      Solution s = new Solution();
      boolean ss = s.isPalindrome(121);
        System.out.println(ss);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int s = 0;
        int num = x;
        while(num!=0){
            s = s * 10 + num % 10;
            num /= 10;
        }
        return s == x;
    }

}
