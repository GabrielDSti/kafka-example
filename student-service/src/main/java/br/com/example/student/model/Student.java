package br.com.example.student.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Student implements Serializable {
    private Long id;
    private String name;
    private String document;
    private Long courseId;
}
