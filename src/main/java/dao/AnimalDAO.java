/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Animal;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author eddunic
 */
public class AnimalDAO {

    public void inserir(Animal animal) {
	//cria e abre sessao
	Session s = HibernateUtil.getSessionFactory().openSession();
	//inicia transacao
	s.beginTransaction();

	//insere
	s.persist(animal);

	//commita
	s.getTransaction().commit();

	//libera memoria
	s.flush();
	//fecha sessao
	s.close();
    }

    public List<Animal> buscar(String codigo) {
	Query query;
	Session s = HibernateUtil.getSessionFactory().openSession();

	String hql = "from Animal u where u.codigo like :codigo";
	query = s.createQuery(hql)
		.setParameter("codigo", codigo);

	return query.list();
    }

    public static void excluir(Long codigo) {
	Session s = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = s.beginTransaction();

	String hql = "delete from Animal u where u.codigo = :codigo";

	Query query = s.createQuery(hql);
	query.setLong("codigo", codigo);
	query.executeUpdate();

	tx.commit();
	s.close();
    }

    public List<Animal> getAll() {
	Query query;
	Session s = HibernateUtil.getSessionFactory().openSession();

	String hql = "from Animal";
	query = s.createQuery(hql);

	return query.list();
    }

}
