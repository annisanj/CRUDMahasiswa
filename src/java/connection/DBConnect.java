package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annisa
 */
public class DBConnect {
    public static DBConnect instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/mhs?zeroDateTimeBehavior=convertToNull";
    private String username = "root";
    private String password = "";

    private DBConnect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database koneksi sukses");
        } catch (ClassNotFoundException ex) {
            System.out.println("Database koneksi Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    public static DBConnect getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnect();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConnect();
        }

        return instance;
    }
}