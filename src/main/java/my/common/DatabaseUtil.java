/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.common;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class DatabaseUtil {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            //1. Nap driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. Thiet lap ket noi CSDL
            conn = DriverManager.getConnection("jdbc:sqlserver://Morris2355;databaseName=demodb", "sa", "tucoi120214");
        } catch (Exception e) {
            System.out.println("Loi: " + e.toString());
        }
        return conn;
    }
}
