package dao;

import java.util.List;
import model.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author eduardo
 */
public class AdminDAO {

    public void inserir(Admin admin) {
        //cria e abre sessao
        Session s = HibernateUtil.getSessionFactory().openSession();
        //inicia transacao
        s.beginTransaction();

        //insere
        s.persist(admin);

        //commita
        s.getTransaction().commit();

        //libera memoria
        s.flush();
        //fecha sessao
        s.close();
    }

//    public List<Admin> buscar(Admin admin) {
//        Query query;
//        Session s = HibernateUtil.getSessionFactory().openSession();
//
//        String hql = "from Admin u where u.email like :email"
//                + " and u.senha like :senha";
//        query = s.createQuery(hql)
//                .setParameter("email", admin.getEmail())
//                .setParameter("senha", admin.getSenha());
//
//        return query.list();
//    }
//    
//    public List<Admin> buscar2(Admin admin) {
//        Query query;
//        Session s = HibernateUtil.getSessionFactory().openSession();
//
//        String hql = "from Admin u where u.email like :email";
//        query = s.createQuery(hql)
//                .setParameter("email", admin.getEmail());
//
//        return query.list();
//    }
//    
//    public List<Admin> buscar3(String email) {
//        Query query;
//        Session s = HibernateUtil.getSessionFactory().openSession();
//
//        String hql = "from Admin u where u.email like :email";
//        query = s.createQuery(hql)
//                .setParameter("email", email);
//
//        return query.list();
//    } 

}
