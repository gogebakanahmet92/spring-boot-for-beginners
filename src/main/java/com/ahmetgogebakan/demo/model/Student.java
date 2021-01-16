package com.ahmetgogebakan.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {
    @JsonProperty("id") private UUID id;
    @JsonProperty("firstName") private final String firstName;
    @JsonProperty("secondName") private final String lastName;
    @JsonProperty("course") private final String course;
    @JsonProperty("age") private final Integer age;

    public Student(
            UUID id,
            String firstName,
            String lastName,
            String course,
            int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
