package bd;

import java.sql.*;


    public class Conexao {

        private static Connection connection;

        public Conexao() {
            connection = null;
        }

        public synchronized void close() {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão");
                System.out.println(e.getMessage());
            }
        }

        private static Connection connect() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/utfpr?useTimezone=true&serverTimezone=UTC", "root", "vertrigo");
        }

        public static Connection getConnection() {
            try {
                if (connection == null || connection.isClosed()) {
                    return connect();
                }
            } catch (Exception e) {
                System.out.println("Erro na conexao");
                System.out.println(e.getMessage());
            }
            return connection;
        }
    }
    
