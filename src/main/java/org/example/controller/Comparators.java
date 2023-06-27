package org.example.controller;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {

    public static void main(String[] asd) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(4, "Sharan"));
        list.add(new Student(2, "Karan"));
        list.add(new Student(1, "Haran"));
        list.add(new Student(3, "Maran"));

        CompareId compareId = new CompareId();
        Collections.sort(list, new CompareId());

        System.out.println(list);
    }

}

class CompareId implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        if (s1.getId() == s2.getId())
            return 0;
        else if (s1.getId() > s2.getId())
            return 1;
        else
            return -1;
    }
}
