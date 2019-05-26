package dao;

import java.util.List;
import model.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
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

    public List<Usuario> buscar3(String email) {
	Query query;
	Session s = HibernateUtil.getSessionFactory().openSession();

	String hql = "from Usuario u where u.email like :email";
	query = s.createQuery(hql)
		.setParameter("email", email);

	return query.list();
    }

    public static void excluir(String email) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = s.beginTransaction();

	String hql = "delete from Usuario u where u.email = :email";

	Query query = s.createQuery(hql);
	query.setString("email", email);
	query.executeUpdate();

	tx.commit();
	s.close();
    }

    public List<Usuario> getAll() {
	Query query;
	Session s = HibernateUtil.getSessionFactory().openSession();

	String hql = "from Usuario";
	query = s.createQuery(hql);

	return query.list();
    }

    public String loginGmail(String email) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	Query query = s.createQuery("from Usuario u where u.email =:email");
	query.setParameter("email", email);

	Usuario u = (Usuario) query.uniqueResult();
	return u.getEmail();
    }

    public Usuario buscarPeloEmail(String email) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	Query query = s.createQuery("from Usuario u where u.email =:email");
	query.setParameter("email", email);

	Usuario u = (Usuario) query.uniqueResult();
	return u;
    }

//    public String atualizar(Usuario u) {
//	Session s = HibernateUtil.getSessionFactory().openSession();
//	Transaction tx = null;
//	try {
//	    tx = s.beginTransaction();
////	    Usuario usuario = (Usuario) s.get(Usuario.class, u.getEmail());
//	    s.update(u);
//	    tx.commit();
//	} catch (HibernateException e) {
//	    if (tx != null) {
//		tx.rollback();
//	    }
//	    e.printStackTrace();
//	} finally {
//	    s.close();
//	}
//    }
    
    public String atualizar(Usuario u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String message = null;
	try {
            session.update(u);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            message = e.getMessage();
        } finally {
            session.close();
        }
        return message;
    }

}
