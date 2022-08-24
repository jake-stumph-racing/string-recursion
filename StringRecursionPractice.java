package com.jakestumph;

import java.util.Scanner;

public class StringRecursionPractice {


//    public static void fillArray(int[][] arr, int row){
//        if(row < arr.length){
//            fillArray(arr[row], 0);
//            fillArray(arr, row+1);
//        }
//    }
//
//    public static void fillArray(int[] arr, int col){
//        if(col < arr.length){
//            fillArray(arr, col+1);
//        }
//    }

// C-3.19: Check is string is a palindrome using recursion
    public static boolean palindrome(String s){

        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1))
            return palindrome((s.substring(1, s.length()-1)));

        return false;
    }

    public static String reverse(String s){
        if(s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the string to check");
//        String string = scanner.nextLine();
//        if(palindrome(string))
//            System.out.println(string + " is a palindrome");
//        else
//            System.out.println(string + " is not a palindrome");

        System.out.println(reverse("ABC"));
    }
}
