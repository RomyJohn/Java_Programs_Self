package org.example;

import org.example.controller.Comparable;
import org.example.controller.Comparators;
import org.example.controller.Serialisable;
import org.example.controller.StreamAPI;

public class App {
    public static void main(String[] args) {

//        Serialisable serialisable = new Serialisable();
//        serialisable.start();
//
        Comparable comparable = new Comparable();
        comparable.start();
//
//        Comparators comparators=new Comparators();
//        comparators.start();

        StreamAPI streamAPI = new StreamAPI();
        streamAPI.start();

    }
}
