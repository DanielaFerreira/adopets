/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.UserTemp;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author eduardo
 */
public class UserTempDAO {

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

    public static void excluir(String email) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();

        String hql = "delete from UserTemp u where u.email = :email";

        Query query = s.createQuery(hql);
        query.setString("email", email);  
        query.executeUpdate();

        tx.commit();
        s.close();
    }

}
