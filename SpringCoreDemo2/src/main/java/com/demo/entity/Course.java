package com.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {

    @Value("1")
    private int courseid;
    @Value("HTML5")
    private String courseName;
    @Value("HTML 5 advance concepts")
    private String description;

    public Course() {
    }

    public Course(int courseid, String courseName, String description) {
        System.out.println("Course param constructor");
        this.courseid = courseid;
        this.courseName = courseName;
        this.description = description;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
