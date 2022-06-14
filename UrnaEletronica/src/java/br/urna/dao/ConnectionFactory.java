package br.urna.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static String urlDB = "jdbc:derby://localhost:1527/urna_eletronica_2n";
    private static String user = "root";
    private static String pass = "root";
    
    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        return DriverManager.getConnection(urlDB, user, pass);
    }
}
