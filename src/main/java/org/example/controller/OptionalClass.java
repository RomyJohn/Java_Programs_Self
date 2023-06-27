package org.example.controller;

import java.util.Arrays;
import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) throws Throwable {

        Optional o1 = Optional.empty();
        Optional<String> o2 = Optional.of("Romy");
        Optional o3 = Optional.ofNullable(Arrays.asList("1"));

        boolean b1 = o2.isPresent();
        boolean b2 = o2.isEmpty();
        System.out.println(o1.orElse("Sorry"));
        System.out.println(o3.get());
        o2.filter(name -> name.length() == 3).ifPresent(item -> System.out.println(item));
        o2.ifPresent(item -> System.out.println(item));
        o2.ifPresent(item -> System.out.println(getString(o2)));
        System.out.println(o1.orElse("Not Present"));
        System.out.println(o1.orElseGet(() -> "Not Present"));
        o1.orElseThrow(() -> new ArithmeticException("No data"));

    }

    public static String getString(Optional<String> data) {
        return data.orElse("Nothing");
    }

    public static Integer getInteger(Optional<Integer> data) {
        return data.orElse(21);
    }

}
