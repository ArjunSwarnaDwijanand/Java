package org.allinone.programs.normal;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num = 12345;
//        int count = 0;
//        while (num != 0) {
//            num = num / 10;
//            count++;
//        }
       int lenghtResult= String.valueOf(num).length();
        System.out.println("Number of digits in the given number is: " + lenghtResult);
       // System.out.println("Number of digits in the given number is: " + count);
    }
}
