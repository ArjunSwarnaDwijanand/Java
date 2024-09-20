package org.allinone.collections.map.comparator;

import java.util.Comparator;

class GradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGrade(), s2.getGrade());
    }
}
