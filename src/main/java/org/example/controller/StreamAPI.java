package org.example.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public void start() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 44, 4, 4);


        Stream s = list.stream();

        List l1 = list.stream().map(i -> i * 10).collect(Collectors.toList());
        List l2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        Long num = list.stream().filter(i -> i % 2 == 0).count();
        List l3 = list.stream().sorted().collect(Collectors.toList());
        list.stream().sorted().forEach(System.out::println);
        list.stream().map(i -> i + 1).filter(i -> i % 2 == 0).forEach(System.out::println);
        list.stream().distinct().forEach(System.out::println);
        Integer num2 = list.stream().max(Integer::compare).get();

        System.out.println(num2);
    }
}
