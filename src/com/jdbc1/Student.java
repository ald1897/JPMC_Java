package com.jdbc1;

import java.util.List;

public class Student {
    private int sid;
    private String studentname;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(int sid, String studentname, String email, String phone) {
        this.sid = sid;
        this.studentname = studentname;
        this.email = email;
        this.phone = phone;
    }
    public static void change(List items){
        items.add(20);
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
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
                '}';
    }
}

