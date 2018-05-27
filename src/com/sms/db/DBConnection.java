/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JSIIT
 */
public class DBConnection {

    private static Connection conn;

    private DBConnection() {
    }

    public static synchronized Connection getConnection() {
        if (conn != null) {
            return conn;
        } else {
            try {
                String url = "jdbc:mysql://localhost:3306/studentdb";
                String username = "sdb_user";
                String password = "P@5sW0rD";

                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                System.err.println(e);
            }

            return conn;
        }
    }
    public static synchronized void closeConnection() {
        if (conn != null) {
            conn = null;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            conn = null;
        }
    }
}
