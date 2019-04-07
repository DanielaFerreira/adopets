package dao;

import java.util.List;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author eduardo
 */
public class UsuarioDAO {

    public void inserir(Usuario usuario) {
        //cria e abre sessao
        Session s = HibernateUtil.getSessionFactory().openSession();
        //inicia transacao
        s.beginTransaction();

        //insere
        s.persist(usuario);

        //commita
        s.getTransaction().commit();

        //libera memoria
        s.flush();
        //fecha sessao
        s.close();
    }

    public List<Usuario> buscar(Usuario usuario) {
        Query query;
        Session s = HibernateUtil.getSessionFactory().openSession();

        String hql = "from Usuario u where u.email like :email"
                + " and u.senha like :senha";
        query = s.createQuery(hql)
                .setParameter("email", usuario.getEmail())
                .setParameter("senha", usuario.getSenha());

        return query.list();
    }
    
    public List<Usuario> buscar2(Usuario usuario) {
        Query query;
        Session s = HibernateUtil.getSessionFactory().openSession();

        String hql = "from Usuario u where u.email like :email";
        query = s.createQuery(hql)
                .setParameter("email", usuario.getEmail());

        return query.list();
    }

}
