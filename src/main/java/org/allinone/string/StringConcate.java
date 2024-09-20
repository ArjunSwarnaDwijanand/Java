package org.allinone.string;

public class StringConcate {

    // String are immutable , which means ocne the string is created it cannot be changed
    // If we try to change the value of the string it will create a new string object
    // The concat() method is used to concatenate a string with another string. It returns a new string that is the concatenation of the original string and the specified string.
    public static void main(String[] args) {

        String str = "Hello World";
        str.concat("Arjun");
        //str = str.concat("Arjun");
        System.out.println("String after concat: " + str);
    }
}

// Output
// String after concat: Hello World
// Explanation
// In the above code, we have a string str = "Hello World" to which we are trying to concatenate another string "Arjun" using the concat() method. However, the concat() method does not modify the original string. Instead, it returns a new string that is the concatenation of the original string and the specified string. Therefore, the original string str remains unchanged after calling the concat() method. If you want to modify the original string, you should assign the result of the concat() method back to the original string as shown below:
// str = str.concat("Arjun");
// This will update the original string str with the concatenated value "Hello WorldArjun". You can try modifying the code to update the original string using the concat() method as an exercise.

