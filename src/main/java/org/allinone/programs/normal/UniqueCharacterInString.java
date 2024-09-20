package org.allinone.programs.normal;

public class UniqueCharacterInString {

    public static void main(String[] args) {
        String str = "hello";
        String isUnique = isUnique(str);
        System.out.println("The Unique string is: " + isUnique);
        if (isUnique.length() == str.length()) {
            System.out.println("The string contains all unique characters." + isUnique);
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }

    private static String isUnique(String str) {
        String unques = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unques = unques + ch;
            }
        }
        System.out.println("The unique characters in the string are: " + unques);
        return unques;
    }
}
