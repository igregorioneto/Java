package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConnection();
        String SQL = "CREATE TABLE IF NOT EXISTS pessoas (" +
                "codigo INT AUTO_INCREMENT NOT NULL PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ");";
        Statement stmt = conexao.createStatement();
        stmt.execute(SQL);

        System.out.println("Tabela criada com sucesso!");
        System.out.println(SQL);
        stmt.close();
        conexao.close();

    }
}
