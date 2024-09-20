package org.allinone.programs.normal;

public class LargestNumberAmongThree {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int largestNumber = findLargestNumber(num1, num2, num3);
        System.out.println("The largest number among " + num1 + ", " + num2 + " and " + num3 + " is: " + largestNumber);
    }

    public static int findLargestNumber(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
