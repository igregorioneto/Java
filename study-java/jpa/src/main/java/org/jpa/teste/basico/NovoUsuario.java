package org.jpa.teste.basico;

import org.jpa.modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class NovoUsuario {
    public static void main(String[] args) {
        Map<String, String> properties = new HashMap<>();
        properties.put("javax.persistence.jdbc.driver", "com.mysql.jdbc.Driver");
        properties.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost/curso_java");
        properties.put("javax.persistence.jdbc.user", "root");
        properties.put("javax.persistence.jdbc.password", "root");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "update");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("João", "joao@teste.com");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O id gerado do novo usuário foi: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
