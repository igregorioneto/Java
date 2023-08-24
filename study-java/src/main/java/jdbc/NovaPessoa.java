package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome de uma pessoa: ");
        String entrada = sc.nextLine();

        Connection conexao = FabricaConexao.getConnection();

        String SQL = "INSERT INTO pessoas (nome) VALUES (?);";
        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1,entrada);
        stmt.execute();

        System.out.println("Pessoa adicionada com sucesso!");
        stmt.close();
        conexao.close();
        sc.close();

    }
}
