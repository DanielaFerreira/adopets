/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.UserTemp;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author eduardo
 */
public class UserTempDAO {

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        try {
            //Obtém o factory a partir da unidade de persistência.
            factory = Persistence.createEntityManagerFactory("adopetsPU");
            //Cria um entity manager.
            entityManager = factory.createEntityManager();
            //Fecha o factory para liberar os recursos utilizado.
        } finally {
            factory.close();
        }
        return entityManager;
    }

    public void inserir(UserTemp userTemp) {
        //cria e abre sessao
        Session s = HibernateUtil.getSessionFactory().openSession();
        //inicia transacao
        s.beginTransaction();

        //insere
        s.persist(userTemp);

        //commita
        s.getTransaction().commit();

        //libera memoria
        s.flush();

        //fecha sessao
        s.close();
    }

    public List<UserTemp> buscarEmail(String codigo) {
        Query query;
        Session s = HibernateUtil.getSessionFactory().openSession();

        String hql = "select email from UserTemp u where u.codigo like :codigo";
        query = s.createQuery(hql)
                .setParameter("codigo", codigo);

        return query.list();
    }

    public List<UserTemp> buscarNome(String codigo) {
        Query query;
        Session s = HibernateUtil.getSessionFactory().openSession();

        String hql = "select nome from UserTemp u where u.codigo like :codigo";
        query = s.createQuery(hql)
                .setParameter("codigo", codigo);

        return query.list();
    }

    public List<UserTemp> buscarSenha(String codigo) {
        Query query;
        Session s = HibernateUtil.getSessionFactory().openSession();

        String hql = "select senha from UserTemp u where u.codigo like :codigo";
        query = s.createQuery(hql)
                .setParameter("codigo", codigo);

        return query.list();
    }
    
    public List<UserTemp> buscarCodigo(String codigo) {
        Query query;
        Session s = HibernateUtil.getSessionFactory().openSession();

        String hql = "select codigo from UserTemp u where u.codigo like :codigo";
        query = s.createQuery(hql)
                .setParameter("codigo", codigo);

        return query.list();
    }

    public void excluir(String email) {
        EntityManager entityManager = getEntityManager();
        try {
            // Inicia uma transação com o banco de dados.
            entityManager.getTransaction().begin();
            // Consulta a pessoa na base de dados através do seu ID.
            UserTemp userTemp = entityManager.find(UserTemp.class, email);
            // Remove a pessoa da base de dados.
            entityManager.remove(userTemp);
            // Finaliza a transação.
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

}
