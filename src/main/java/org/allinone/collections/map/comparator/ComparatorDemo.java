package org.allinone.collections.map.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 3.8, new java.util.Date(1990, 1, 1)));
        students.add(new Student(2, "Adam", 3.9, new java.util.Date(1991, 1, 1)));
        students.add(new Student(3, "Mary", 3.7, new java.util.Date(1992, 1, 1)));
        students.add(new Student(4, "Sophia", 3.6, new java.util.Date(1993, 1, 1)));


        System.out.println("Before sorting: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new NameComparator());

        System.out.println("\nAfter sorting by Name: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new GradeComparator());

        System.out.println("\nAfter sorting by Grade: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new DateComparator());

        System.out.println("\nAfter sorting by Date of Birth: ");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}

// Output

// Before sorting:
// Student{id=1, name='John', grade=3.8, dateOfBirth=Fri Feb 01 00:00:00 IST 1990}
// Student{id=2, name='Adam', grade=3.9, dateOfBirth=Sat Feb 01 00:00:00 IST 1991}
// Student{id=3, name='Mary', grade=3.7, dateOfBirth=Sun Feb 01 00:00:00 IST 1992}
// Student{id=4, name='Sophia', grade=3.6, dateOfBirth=Mon Feb 01 00:00:00 IST 1993}

// After sorting by Name:
// Student{id=2, name='Adam', grade=3.9, dateOfBirth=Sat Feb 01 00:00:00 IST 1991}
// Student{id=1, name='John', grade=3.8, dateOfBirth=Fri Feb 01 00:00:00 IST 1990}
// Student{id=3, name='Mary', grade=3.7, dateOfBirth=Sun Feb 01 00:00:00 IST 1992}
// Student{id=4, name='Sophia', grade=3.6, dateOfBirth=Mon Feb 01 00:00:00 IST 1993}

// After sorting by Grade:
// Student{id=2, name='Adam', grade=3.9, dateOfBirth=Sat Feb 01 00:00:00 IST 1991}
// Student{id=1, name='John', grade=3.8, dateOfBirth=Fri Feb 01 00:00:00 IST 1990}
// Student{id=3, name='Mary', grade=3.7, dateOfBirth=Sun Feb 01 00:00:00 IST 1992}
// Student{id=4, name='Sophia', grade=3.6, dateOfBirth=Mon Feb 01 00:00:00 IST 1993}

// After sorting by Date of Birth:
// Student{id=4, name='Sophia', grade=3.6, dateOfBirth=Mon Feb 01 00:00:00 IST 1993}
// Student{id=3, name='Mary', grade=3.7, dateOfBirth=Sun Feb 01 00:00:00 IST 1992}
// Student{id=2, name='Adam', grade=3.9, dateOfBirth=Sat Feb 01 00:00:00 IST 1991}
// Student{id=1, name='John', grade=3.8, dateOfBirth=Fri Feb 01 00:00:00 IST 1990}
//

// Comparator Scenario based interview questions and answers

// Q1. What is the difference between Comparable and Comparator interfaces in Java?

// Ans. Comparable interface is used to order the objects of user-defined class. It provides a single sorting sequence only i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age, or anything else.

// Comparator interface is used to order the objects of user-defined class. It provides multiple sorting sequences i.e., you can sort the elements on the basis of any data member. For example, it may be rollno, name, age, or anything else.

// Q2. What is the difference between hashcode() and equals() in Java?

// Ans. The hashcode() method is used to get the hash code of an object. It returns an integer value. The equals() method is used to compare two objects. It returns a boolean value.

// Q3. What is the difference between equals() and == in Java?

// Ans. The equals() method is used to compare the content of two objects. It returns a boolean value. The == operator is used to compare the reference of two objects. It returns a boolean value.

// Q4. What is the difference between compare() and compareTo() ?

// Ans. The compare() method is used to compare two objects. It returns an integer value. The compareTo() method is used to compare two objects. It returns an integer value.

// Q5. What is the difference between fail-fast and fail-safe iterators in Java?

// Ans. Fail-fast iterators throw ConcurrentModificationException if the collection is modified while iterating over it. Fail-safe iterators do not throw ConcurrentModificationException if the collection is modified while iterating over it.

// Q6. What is the difference between HashMap and ConcurrentHashMap in Java?

// Ans. HashMap is not thread-safe, whereas ConcurrentHashMap is thread-safe. HashMap allows null keys and values, whereas ConcurrentHashMap does not allow null keys and values.


