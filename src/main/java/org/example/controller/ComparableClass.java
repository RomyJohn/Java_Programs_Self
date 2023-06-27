package org.example.controller;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass {

    public static void main(String[] asd) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(4, "Sharan"));
        list.add(new Student(2, "Karan"));
        list.add(new Student(1, "Haran"));
        list.add(new Student(3, "Maran"));

        Collections.sort(list);
        System.out.println(list);
    }
}

