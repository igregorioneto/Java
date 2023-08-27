package org.jpa.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<T> {
    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<T> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("jpa");
        } catch (Exception e) {
            // tratamento
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<T> classe) {
        this.classe = classe;
    }

    public DAO<T> abrirT() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<T> fecharT() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<T> incluir(T entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<T> incluirAtomico(T entidade) {
        return this.abrirT().incluir(entidade).fecharT();
    }

    public List<T> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<T> obterTodos(int quantidade, int deslocamento) {
        if (classe == null) {
            throw new IllegalArgumentException("Classe nula");
        }

        String jpql = "select t from " + classe.getName() + " t";
        TypedQuery<T> query = em.createQuery(jpql, classe);
        query.setMaxResults(quantidade);
        query.setFirstResult(deslocamento);
        return query.getResultList();
    }

    public List<T> consultar(String nomeConsulta, Object... parametros) {
        TypedQuery<T> query = em.createNamedQuery(nomeConsulta, classe);

        for (int i = 0; i < parametros.length; i++) {
            query.setParameter(parametros[i].toString(), parametros[i + 1]);
        }
        return query.getResultList();
    }

    public T consultarUm(String nomeConsulta, Object... parametros) {
        List<T> lista = consultar(nomeConsulta, parametros);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public void fechar() {
        em.close();
    }
}
