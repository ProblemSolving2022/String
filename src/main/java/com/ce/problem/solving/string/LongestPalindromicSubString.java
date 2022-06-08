package com.ce.problem.solving.string;

/*
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

 */

public class LongestPalindromicSubString {

    private static int start, length;

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println(longestPalindromicSubstring(s1));
        System.out.println(longestPalindromicSubstring(s2));
    }

    private static String longestPalindromicSubstring(String str){
        int strLength = str.length();
        if(strLength<2) return str;

        start=0;
        length=0;
        for(int i=0; i<str.length()-1; i++){
            expandRange(str, i,i);
            expandRange(str, i,i+1);
        }

        return str.substring(start,start+length);
    }

    private static void expandRange(String s, int begin, int end){
        while(begin >=0 && end<s.length() && s.charAt(begin)==s.charAt(end)){
            begin--;
            end++;
        }
        if(length < end-begin-1){
            start = begin+1;
            length = end-begin-1;
        }
    }
}
