package org.allinone.collections.map.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Arjun", 85.5));
        students.add(new Student(2, "Nag", 90.0));
        students.add(new Student(3, "Babu", 75.0));
        students.add(new Student(4, "Dwija", 88.0));

        Collections.sort(students);

        System.out.println("Sorted Students by Grade:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

//what is comparable interface in java?

//The Comparable interface is used to order the objects of user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only i.e., you can sort the elements on the basis of single data member only. For example it may be rollno, name, age or anything else.


