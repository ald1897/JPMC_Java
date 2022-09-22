package com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    public boolean insertStudent(Student student) throws SQLException, ClassNotFoundException {
        //1 .get connection
        Connection conn = DBConnection.getConnection();

//        String sql = "insert into student values(?,?,?,?)";

        Statement statement = conn.createStatement();
        //insert into student values(1,"name","email","phone");
        String sql = "Insert into student values("+student.getSid()+",'"+student.getStudentname()+"','"+student.getEmail()+"','"+student.getPhone()+"')";

        try{ statement.executeUpdate(sql);}
        catch(Exception e){
            e.printStackTrace();
            return false;
        }finally {
            conn.close();
        }
        return true;
    }

    public boolean insertStudentWithPS(Student student) throws SQLException, ClassNotFoundException {
        //1 .get connection
        Connection conn = DBConnection.getConnection();

        String sql = "insert into student values(?,?,?,?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        //insert into student values(1,"name","email","phone");
//        String sql = "Insert into student values("+student.getStudentId()+",'"+student.getStudentname()+"','"+student.getEmail()+"','"+student.getPhone()+"')";
        statement.setInt(1,student.getSid());
        statement.setString(2,student.getStudentname());
        statement.setString(3,student.getEmail());
        statement.setString(4,student.getPhone());



        try{ statement.executeUpdate();}
        catch(Exception e){
           e.printStackTrace();
           return false;
        }finally {
            conn.close();
        }
        return true;
    }
    public boolean updateStudentWithPS(String name, int id) throws SQLException, ClassNotFoundException {
        //1 .get connection
        Connection conn = DBConnection.getConnection();
        String sql = "update student set studentname =? where sid = ?";
        PreparedStatement statement = conn.prepareStatement(sql);

        //insert into student values(1,"name","email","phone");
//        String sql = "Insert into student values("+student.getStudentId()+",'"+student.getStudentname()+"','"+student.getEmail()+"','"+student.getPhone()+"')";
        statement.setString(1, name);
        statement.setInt(2,id);


        try{ statement.executeUpdate();}
        catch(Exception e){
            e.printStackTrace();
            return false;
        } finally {
            conn.close();
        }
        return true;
    }
    public boolean deleteStudentWithPS(int id) throws SQLException, ClassNotFoundException {
        //1 .get connection
        Connection conn = DBConnection.getConnection();

        String sql = "delete from student where sid = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        //insert into student values(1,"name","email","phone");
//        String sql = "Insert into student values("+student.getStudentId()+",'"+student.getStudentname()+"','"+student.getEmail()+"','"+student.getPhone()+"')";
        statement.setInt(1,id);


        try{ statement.executeUpdate();}
        catch(Exception e){
            e.printStackTrace();
            return false;
        }finally {
            conn.close();
        }
        return true;
    }

    public Student getStudentById(int id) throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.getConnection();
        String sql = "select studentname, email from student where sid = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1,id);
        ResultSet rs= statement.executeQuery();
        if (rs.next()) {
//            System.out.println(rs.getString(1));
            Student student = new Student();

            student.getStudentname();



            return student;
        }

        return null;


    }

    public List<Student> getStudents() throws SQLException, ClassNotFoundException {
            List<Student> students = new ArrayList();
            Connection conn = DBConnection.getConnection();
            String sql = "select * from student ";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            if (rs.next()) {
//                System.out.println(rs.getString(1));
                Student student = new Student();
                student.setSid(rs.getInt(1));
                student.setStudentname(rs.getString(2));
                student.setEmail(rs.getString(3));
                student.setPhone(rs.getString(4));
                students.add(student);


                return students;
            }

            return null;


        }
    }

