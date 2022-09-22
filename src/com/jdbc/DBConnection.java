package com.jdbc;

import java.sql.*;


public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // load the driver, by adding it to build path
//        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/training", "root", "admin");

            System.out.println("database connect" + con);
            ;
            return con;

//here sonoo is database name, root is username and password
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from emp");
//
//            while (rs.next())
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}

