package ConnectionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    public static void main(String[] args) {
        String url = "";
        String usuario = "root";
        String senha = "root";

        try {
            Connection connection = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucessida!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

    }
}
