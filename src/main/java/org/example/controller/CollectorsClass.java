package org.example.controller;

import org.example.entity.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsClass {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Karan");
        Student s2 = new Student(2, "Suraj");
        Student s3 = new Student(3, "Kiran");
        Student s4 = new Student(4, "Sharan");
        Student s5 = new Student(5, "Taran");
        List<Student> list = Arrays.asList(s2, s1, s5, s3, s2, s4);

        Integer[] arr = {2, 5, 2, 4, 2, 7, 2};
        List<Integer> list1 = Arrays.asList(arr);

        //toMap, toList, toSet
        //getMax, getAverage, getCount, getMin, getSum
        int aggregate = list.stream().collect(Collectors.summarizingInt(item -> item.getId())).getMin();
        long count = list.stream().collect(Collectors.counting());
        int sum = list.stream().collect(Collectors.summingInt(item -> item.getId()));
        double avg = list.stream().collect(Collectors.averagingInt(item -> item.getId()));
        int max = list.stream().map(item -> item.getId()).collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        int min = list.stream().map(item -> item.getId()).collect(Collectors.minBy(Comparator.naturalOrder())).get();
        Map map = list.stream().collect(Collectors.groupingBy(item -> item.getId()));

        int aggregate1 = list1.stream().collect(Collectors.summarizingInt(item -> item)).getMin();
        long count1 = list1.stream().collect(Collectors.counting());
        int sum1 = list1.stream().collect(Collectors.summingInt(item -> item));
        double avg1 = list1.stream().collect(Collectors.averagingInt(item -> item));
        int max1 = list1.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        int min1 = list1.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
        Map map1 = list1.stream().collect(Collectors.groupingBy(item -> item));

    }
}
