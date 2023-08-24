package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaPessoasNome {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o filtro da pesquisa do usuário pelo nome: ");
        String filtro = sc.nextLine();

        Connection conexao = FabricaConexao.getConnection();

        String SQL = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(SQL);
        stmt.setString(1, "%" + filtro + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p:pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        stmt.close();
        conexao.close();
        sc.close();
    }
}
