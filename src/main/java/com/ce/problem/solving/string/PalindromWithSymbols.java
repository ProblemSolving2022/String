package com.ce.problem.solving.string;

public class PalindromWithSymbols {

    public static void main(String[] args) {
        String s1 = "A bana, pan : ana, ana nap' anab a";
        System.out.println(isPalindromUsingWhileLoop(s1));
    }

    private static boolean isPalindromUsingWhileLoop(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if(!isLetter(s.charAt(i))) {
                i++;
                continue;
            }
            if(!isLetter(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

    private static boolean isLetter(char c){
        return Character.isLetter(c);
    }
}
