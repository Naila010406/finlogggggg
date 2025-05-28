package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class KoneksiWindowsAuth {
    public static Connection getConnection() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=projekPemlan;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Koneksi Berhasil (Windows Authentication)");
            return conn;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal: " + e.getMessage());
            return null;
        }
    }
}