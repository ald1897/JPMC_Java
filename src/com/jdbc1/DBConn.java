package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/training", "root", "admin");
        System.out.println("DB connected");
        return con;
    }
}
