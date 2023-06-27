package org.example.controller;

import org.example.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StreamClass {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Karan");
        Student s2 = new Student(2, "Suraj");
        Student s3 = new Student(3, "Kiran");
        Student s4 = new Student(4, "Sharan");
        Student s5 = new Student(5, "Taran");
        List<Student> list = Arrays.asList(s2, s1, s5, s3, s2, s4);

        Integer[] arr = {2, 5, 2, 4, 2, 7, 2};
        List<Integer> list1 = Arrays.asList(arr);

        List l1 = list.stream().map(item -> item.getId() * 10).collect(Collectors.toList());
        Set l2 = list.stream().filter(item -> item.getId() % 2 == 0).collect(Collectors.toSet());
        Long count = list.stream().count();
        list.stream().forEach(System.out::println);
        list.stream().map(item -> item.getId()).sorted().forEach(System.out::println);
        list.stream().map(item -> item.getId()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List l3 = list.stream().filter(item -> item.getId() > 2).filter(item -> item.getId() % 2 == 0).collect(Collectors.toList());
        list.stream().map(item -> item.getId()).min(Comparator.naturalOrder()).get();
        list.stream().map(item -> item.getId()).max(Comparator.naturalOrder()).get();
        long distinct = list.stream().map(item -> item.getId()).distinct().count();
        list.stream().map(item -> item.getId()).forEachOrdered(System.out::println);
        int min = list.stream().mapToInt(item -> item.getId()).min().getAsInt();
        int max = list.stream().mapToInt(item -> item.getId()).max().getAsInt();
        int sum = list.stream().mapToInt(item -> item.getId()).sum();
        double avg = list.stream().mapToInt(item -> item.getId()).average().getAsDouble();
        long count1 = list.stream().mapToInt(item -> item.getId()).count();

        //returns true when 0 record will have 3 as length
        boolean b1 = list.stream().noneMatch(item -> item.getName().length() == 3);
        //returns true when any record will have 3 as length
        boolean b2 = list.stream().anyMatch(item -> item.getName().length() == 5);
        //returns true when all records will have 3 as length
        boolean b3 = list.stream().allMatch(item -> item.getName().length() == 5);


    }
}
