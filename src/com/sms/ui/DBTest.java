/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.ui;

import com.sms.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JSIIT
 */
public class DBTest {

    public static void main(String[] args) {
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            System.out.println("Connection is successful. " + connection);
        } else {
            System.out.println("Connection failed");
        }

        String data = "SELECT * FROM student";
        try (PreparedStatement ps = connection.prepareStatement(data);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getString(4) + "\t");
                System.out.print(rs.getDouble(5) + "\t");
                System.out.println(rs.getDate(6));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e + "\n");
        }

    }

}
