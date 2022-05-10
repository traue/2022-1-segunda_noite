package br.sisacademico.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //para nos conectarmos à qualqur BD precisamos de 4 coisas...:
    // - URL da base (servidor)
    // - Nome do banco (neste caso o nome da base ficará junto com a URL)
    // - Usuário
    // - Senha

    private static final String urlDB = "jdbc:derby://localhost:1527/sisacademico_2noite";
    private static final String user = "uninove";
    private static final String pass = "Senha123";
    
    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
        return DriverManager.getConnection(urlDB, user, pass);
    }
}
