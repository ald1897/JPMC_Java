package com.jdbc1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

    public boolean insertStudent(Student student) throws SQLException, ClassNotFoundException {
        // 1. Get the connection object
        Connection conn = com.jdbc1.DBConn.getConnection();
        // 2. execute statement to the database
        Statement statement = conn.createStatement();
        //3. write the query
        // insert into student values(1,'Payal','payal@eamil.com','67895678678')
        String sql = "insert into student values("+student.getSid()+
                ",'"+ student.getStudentname()+"','"+student.getEmail()+ "','"+student.getPhone()+"')";
        try{statement.executeUpdate(sql);}
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            conn.close();
        }

        return true;
    }
    public boolean insertStudentWithPS(Student student) throws SQLException, ClassNotFoundException {
        // 1. Get the connection object
        Connection conn = DBConn.getConnection();
        // 2. execute statement to the database
        String sql = "insert into student values(?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        //3. write the query
        // insert into student values(1,'Payal','payal@eamil.com','67895678678')
        statement.setInt(1, student.getSid());
        statement.setString(2, student.getStudentname());
        statement.setString(3, student.getEmail());
        statement.setString(4, student.getPhone());
        try{statement.executeUpdate();}
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            conn.close();
        }
        return true;
    }
    public boolean updateStudentWithPS(String name, int id) throws SQLException, ClassNotFoundException {
        Connection conn = DBConn.getConnection();
        String sql = "update student set studentname=? where sid=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, name);
        statement.setInt(2, id);
        try{statement.executeUpdate();}
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            conn.close();
        }
        return true;
    }
    public boolean deleteStudentWithPS(int id) throws SQLException, ClassNotFoundException {
        // 1. Get the connection object
        Connection conn = DBConn.getConnection();
        // 2. execute statement to the database
        String sql = "delete from student where sid = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        //3. write the query
        // insert into student values(1,'Payal','payal@eamil.com','67895678678')
        statement.setInt(1, id);
        try{statement.executeUpdate();}
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            conn.close();
        }
        return true;
    }
    public Student getStudentById(int id) throws SQLException, ClassNotFoundException {
        Connection conn = DBConn.getConnection();
        String sql = "select studentname, email from student where sid=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=  statement.executeQuery();
        if(rs.next()) {
            //System.out.println(rs.getString(1));
            Student student = new Student();
            student.setStudentname(rs.getString(1));
            student.setEmail(rs.getString(2));
            return student;
        }
        return null;
    }
    public List<Student> getStudents() throws SQLException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        String sql = "select * from student ";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs=  statement.executeQuery();
        while(rs.next()) {
            //System.out.println(rs.getString(1));
            Student student = new Student();
            student.setSid(rs.getInt(1));
            student.setStudentname(rs.getString(2));
            student.setEmail(rs.getString(3));
            student.setPhone(rs.getString(4));
            students.add(student);
        }
        return students;
    }
}
