package org.example.controller;

import org.example.entity.Student;

import java.io.*;

public class Serialisable {

    public void start() {
        Student student = new Student(1, "karan");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D://Intellij Workspace//Programs//Demo.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            FileInputStream fileInputStream = new FileInputStream("D://Intellij Workspace//Programs//Demo.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student1 = (Student) objectInputStream.readObject();

            System.out.println("Student Data : " + student1.getId() + " " + student1.getName());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
