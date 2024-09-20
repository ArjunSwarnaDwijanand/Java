package org.allinone.programs.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArraylistUsingCollections {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Original List: " + list);

        // Shuffle the list using Collections.shuffle() method
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        list.toArray(arr);
        System.out.println("Array after shuffling: " + Arrays.toString(arr));

    }
}
