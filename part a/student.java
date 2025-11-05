package com.example.di;

public class Student {
    private Course course;

    // Constructor-based Injection
    public Student(Course course) {
        this.course = course;
    }

    public void showCourse() {
        System.out.println("Student is enrolled in: " + course.getCourseName());
    }
}
