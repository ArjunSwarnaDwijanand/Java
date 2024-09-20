package org.allinone.string;

public class StringLiteralDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str3 == str4); // false
    }

    // Output
    // true
    // false
    // false

    // Explanation
    // In the above code, we have created four string objects str1, str2, str3, and str4.
    // str1 and str2 are string literals, and str3 and str4 are created using the new keyword.
    // When we create a string literal, the JVM checks the string constant pool for the existence of the string. If the string is already present in the pool, the reference to the existing string is returned. If the string is not present in the pool, a new string is created in the pool.
    // In the case of str1 and str2, both strings are string literals with the same value "Hello". Since string literals are stored in the string constant pool, both str1 and str2 point to the same string object in the pool. Therefore, str1 == str2 returns true.
    // In the case of str3 and str4, we are creating new string objects using the new keyword. Even though the values of str3 and str4 are the same ("Hello"), they are stored as separate objects in the heap memory. Therefore, str3 == str4 returns false.
    // Note: When comparing strings using the == operator, it compares the references of the strings, not the values. To compare the values of strings, you should use the equals() method.

}
