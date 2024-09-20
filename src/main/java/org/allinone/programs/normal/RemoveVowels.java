package org.allinone.programs.normal;

public class RemoveVowels {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);

        String result = removeVowels(str);
        System.out.println("String after removing vowels: " + result);
    }

    public static String removeVowels(String str) {
       // return str.replaceAll("[aeiouAEIOU]", "");
        String vowels = "aeiouAEIOU";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) == -1) {
                output += str.charAt(i);
            }
        }
        return output;
    }
}
