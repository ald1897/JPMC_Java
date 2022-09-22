package com.jdbc;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        DBConnection.getConnection();

//        Student s1 = new Student(1, "Alex", "alex@gmail.com", "8569812793");
//        Student s3 = new Student(3, "Ella", "ella@gmail.com", "34556432");
        StudentDatabase sd = new StudentDatabase();
//        System.out.println(sd.insertStudent(s1));
//        System.out.println(sd.insertStudentWithPS(s3));
//        System.out.println(sd.updateStudentWithPS("Alexander Dickinson", 1));
////        System.out.println(sd.);
//        System.out.println(sd.getStudentById(1));
//        System.out.println(sd.getStudentById(2));
//        System.out.println(sd.getStudentById(3));
//        System.out.println(sd.getStudentById(4));
        Student s1 = new Student(6,"bill", "bi@gmail.com", "45673451");
//        System.out.println(sd.getStudentById(1));
        for (Student student:sd.getStudents()) {
            System.out.println(student);
        }


    }
}
