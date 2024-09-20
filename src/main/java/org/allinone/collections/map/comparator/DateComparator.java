package org.allinone.collections.map.comparator;

import java.util.Comparator;

public class DateComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getDob().compareTo(s2.getDob());
    }
}


