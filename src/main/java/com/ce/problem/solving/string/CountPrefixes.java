package com.ce.problem.solving.string;

import java.util.Arrays;

// You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.
//Return the number of strings in words that are a prefix of s.
//A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.
// Constraints:
//1 <= words.length <= 1000
//1 <= words[i].length, s.length <= 10
//words[i] and s consist of lowercase English letters only.

public class CountPrefixes {

    public static void main(String[] args) {
        String[] strs1 = {"a","b","c","ab","bc","abc"};
        String s1 = "abc";
        System.out.println(countPrefixes(strs1,s1));

        String[] strs2 = {"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
        String s2 = "w";
        System.out.println(countPrefixes(strs2,s2));
    }

    private static int countPrefixes(String[] strs, String str){
        if(str.length()==0) return -1;
        return (int) Arrays.stream(strs)
                .filter(x -> x.length() <= str.length())
                .filter(x -> str.substring(0,x.length()).equalsIgnoreCase(x))
                .count();
    }
}
