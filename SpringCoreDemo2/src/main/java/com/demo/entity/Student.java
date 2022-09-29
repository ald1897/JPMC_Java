package com.demo.entity;
// bean => every java class is called as a bean
// pojo =>any class that has no dependency of type is-a so it can be unit testable
// entity

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Student, Customer, employee, Product => entity => database table
 * Utility
 * Constants
 * StringValidator
 */
@Component
public class Student {
    @Value("101")
    private int sid;
    @Value("Shalini")
    private String studentname;
    @Value("shalini@gmail.com")
    private String email;
    @Value("12323232332")
    private String phone;
    @Autowired
    private Course course;
    // Student s1 = new Student(1,"",....)
    public Student() {
        System.out.println("Student default constructor");
    }

    public Student(int sid, String studentname, String email, String phone, Course course) {
        System.out.println("Student parameterized constructor");
        this.sid = sid;
        this.studentname = studentname;
        this.email = email;
        this.phone = phone;
        this.course = course;
    }

    public Student(int sid, String studentname, String email, String phone) {
        System.out.println("Student parameterized constructor");
        this.sid = sid;
        this.studentname = studentname;
        this.email = email;
        this.phone = phone;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {

        System.out.println("set id");
        this.sid = sid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", studentname='" + studentname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", course=" + course +
                '}';
    }
}
