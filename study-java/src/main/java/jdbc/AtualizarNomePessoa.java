package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarNomePessoa {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConnection();

        System.out.print("Digite o CODIGO da PESSOA para ser atualizada:  ");
        int codigo = sc.nextInt();
        System.out.print("Digite o novo NOME para ser atualizado: ");
        String nome = sc.next();

        String SQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, nome);
        stmt.setInt(2, codigo);
        stmt.execute();

        SQL = "SELECT * FROM pessoas";
        ResultSet resultado = stmt.executeQuery(SQL);
        List<Pessoa> pessoas = new ArrayList<>();
        while (resultado.next()) {
            int codigoPessoa = resultado.getInt("codigo");
            String nomePessoa = resultado.getString("nome");
            pessoas.add(new Pessoa(codigoPessoa, nomePessoa));
        }

        for (Pessoa p: pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        System.out.println("Pessoa atualizada com sucesso!");

        stmt.close();
        conexao.close();
        sc.close();
    }
}
