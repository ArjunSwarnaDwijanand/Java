package org.allinone.programs.normal;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String str = "Hello World Hello Java World";
        String[] words = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Frequency:" + map);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

// Output: Word Frequency:{Hello=2, Java=1, World=2}
// Explanation: Here, we have a string str = "Hello World Hello Java World" from which we need to find the frequency of each word. To find the frequency of each word, we split the string into words using the split() method with a space delimiter. Then, we iterate over each word and maintain a map to store the frequency of each word. If the word is already present in the map, we increment its frequency by 1. If the word is not present, we add it to the map with a frequency of 1. Finally, we print the word frequency map and iterate over the map entries to print each word along with its frequency.
// Complexity Analysis:
// Time Complexity: O(n), where n is the number of words in the input string. We iterate over each word in the string to find the frequency of each word.
// Space Complexity: O(n), where n is the number of unique words in the input string. We are using a map to store the frequency of each word, which can have at most n entries (where n is the number of unique words).
// Note: This approach finds the frequency of each word in a string. If you want to find the frequency of each character in a string, you can use a similar approach with a map to store the frequency of each character. You can try implementing the frequency of each character in a string as an exercise.

