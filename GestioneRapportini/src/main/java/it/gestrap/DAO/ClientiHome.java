package it.gestrap.DAO;
// Generated 24 giu 2020, 11:04:10 by Hibernate Tools 5.1.10.Final

import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import it.gestrap.entita.Clienti;


/**
 * Home object for domain model class Clienti.
 * @see it.gestrap.DAO.Clienti
 * @author Hibernate Tools
 */

@Stateless
public class ClientiHome {

	private static final Log log = LogFactory.getLog(ClientiHome.class);

	private static SessionFactory sessionFactory = initHibernateUtil();

	private static SessionFactory initHibernateUtil() {

		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (HibernateException ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Clienti transientInstance) {
		log.debug("persisting Clienti instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public Clienti merge(Clienti detachedInstance) {
		log.debug("merging Clienti instance");
		try {
			Clienti result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public static void findByPrimaryKey(int id) {
		Session session = ClientiHome.getSessionFactory().openSession();
		@SuppressWarnings("unused")
		Transaction trasanzione = null;
		trasanzione = session.beginTransaction(); 
		Clienti clienti = (Clienti) session.get(Clienti.class, id);
		System.out.println();
		System.out.println("METODO Find By Primary Key");
		System.out.println(clienti.getPiva() + clienti.getNome());
		session.getTransaction().commit();
	}
	
	public void delete(int id) {
		Session session = ClientiHome.getSessionFactory().openSession();
		Transaction trasanzione = null;
		trasanzione = session.beginTransaction();
		Clienti clienti = session.get(Clienti.class, id);
		clienti.setId(id);
		session.delete(clienti);
		trasanzione.commit();
		session.close();
	}
	
	@SuppressWarnings("deprecation")
	public void findAll() {
		System.out.println();
		System.out.println("METODO FINDALL:");
		Session session = ClientiHome.getSessionFactory().openSession();
		Transaction trasanzione = null;
		trasanzione = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Clienti> utenti = session
		.createSQLQuery("select * from CLIENTI order by PIVA")
		.addEntity(Clienti.class).list();
		System.out.println(utenti.size() + " Clienti trovati: ");

		for (Iterator<Clienti> iter = utenti.iterator(); iter.hasNext();) {
			Clienti us = iter.next();
			System.out.println(us.getNome() + " " + us.getPiva());
		}
		trasanzione.commit();
		session.close();
	}
	
	public void insert(Integer id, String codice, String nome, String piva, String descrizione) {
		Session session = ClientiHome.getSessionFactory().openSession();
		Transaction trasanzione = null;
		trasanzione = session.beginTransaction();
		Clienti clienti = new Clienti();
		clienti.setId(id);
		clienti.setCodice(codice);
		clienti.setNome(nome);
		clienti.setPiva(piva);
		clienti.setDescrizione(descrizione);
		session.save(clienti);
		trasanzione.commit();
		session.close();
	}
	
	public void update(int id) {
		System.out.println("Metodo Update");
		Session session = ClientiHome.getSessionFactory().openSession();
		Transaction trasanzione = null;
		trasanzione = session.beginTransaction();
		Clienti clienti = (Clienti) session.load(Clienti.class, Integer.valueOf(id));
		/*clienti.setId(id);
		clienti.setCodice(codice);
		clienti.setNome(nome);
		clienti.setPiva(piva);
		clienti.setDescrizione(descrizione);*/
		session.save(clienti);
		trasanzione.commit();
		session.close();
	}
	
	public void upt(int id) {
		System.out.println("Metodo Update");
		Session session = ClientiHome.getSessionFactory().openSession();
		Transaction trasanzione = null;
		Clienti user = session.get(Clienti.class, id);
		user.setNome("");
		session.save(user);
		trasanzione.commit();
		session.close();
	}
}