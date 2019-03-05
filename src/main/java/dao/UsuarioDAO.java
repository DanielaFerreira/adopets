package dao;

import java.util.List;
import java.util.regex.Pattern;
import model.Usuario;
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
        Session s = HibernateUtil.getSessionFactory().openSession();
        String hql;
        List<Usuario> text;
        if(!Pattern.matches("[A-Za-z0-9\\\\._-]+@[A-Za-z0-9]+(\\\\.[A-Za-z]+)*", usuario.getNome())) {
            hql = "from Usuario u where u.nome like :nome"
                    + " and u.senha like :senha";
            text = s.createQuery(hql)
                    .setParameter("nome", usuario.getNome())
                    .setParameter("senha", usuario.getSenha())
                    .list();
            
        } else {
            hql = "from Usuario u where u.email like :email"
                    + " and u.senha like :senha";
            text = s.createQuery(hql)
                    .setParameter("email", usuario.getEmail())
                    .setParameter("senha", usuario.getSenha())
                    .list();
            
        }
         return text;
//        if(usuario.getNome().contains("@")) {
//            hql = "from Usuario u where u.email like :email"
//                    + " and u.senha like :senha";
//            text = s.createQuery(hql)
//                    .setParameter("email", usuario.getEmail())
//                    .setParameter("senha", usuario.getSenha())
//                    .list();
//        } else {
//            hql = "from Usuario u where u.nome like :nome"
//                    + " and u.senha like :senha";
//            text = s.createQuery(hql)
//                    .setParameter("nome", usuario.getNome())
//                    .setParameter("senha", usuario.getSenha())
//                    .list();
//        }

       
    }
}
