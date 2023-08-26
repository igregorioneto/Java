package jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String SQL = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?);";
        System.out.println(dao.incluir(SQL, "João da Silva", 1000));
        System.out.println(dao.incluir(SQL, "Fernanda Cabral", 1001));
        System.out.println(dao.incluir(SQL, "Gabriela Lima", 1002));

        dao.close();
    }
}
