package org.allinone.collections.map.comparator;

import java.util.Date;

class Student {
    private int id;
    private String name;
    private double grade;
    private Date dob;

    public Student(int id, String name, double grade, Date dob) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.dob = dob;
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

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + ", dob=" + dob + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

}


