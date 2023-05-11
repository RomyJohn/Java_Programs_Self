package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable, Comparable<Student> {

    private Integer id;
    private String name;

    public int compareTo(Student o) {
        if(id==o.id)
            return 0;
        else if(id>o.id)
            return 1;
        else
            return -1;
    }
}
