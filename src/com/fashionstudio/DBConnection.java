package com.fashionstudio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/fashion_stitching_db";

    private static final String USER = "fashion_app";

    private static final String PASSWORD = "FashionApp@123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}