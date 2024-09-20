package org.allinone.programs.normal;

public class ReverseWord {

    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");

        StringBuilder reverseString = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reverseString.append(words[i]).append(" ");
            }
        System.out.println(reverseString.toString().trim());
        }
    }

