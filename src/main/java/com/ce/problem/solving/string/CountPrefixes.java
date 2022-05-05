package com.ce.problem.solving.string;

import java.util.Arrays;

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
