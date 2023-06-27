package org.example.controller;

import org.example.entity.Student;

import java.io.*;

public class SerializableClass {

    public static void main(String[] args) {

        Student student = new Student(1, "karan");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Data.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            FileInputStream fileInputStream = new FileInputStream("Data.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student s = (Student) objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
