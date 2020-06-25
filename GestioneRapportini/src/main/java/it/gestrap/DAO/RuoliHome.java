package it.gestrap.DAO;
// Generated 24 giu 2020, 11:04:10 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.gestrap.entita.Ruoli;

/**
 * Home object for domain model class Ruoli.
 * @see it.gestrap.DAO.Ruoli
 * @author Hibernate Tools
 */
@Stateless
public class RuoliHome {

	private static final Log log = LogFactory.getLog(RuoliHome.class);

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

	public void persist(Ruoli transientInstance) {
		log.debug("persisting Ruoli instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ruoli persistentInstance) {
		log.debug("removing Ruoli instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ruoli merge(Ruoli detachedInstance) {
		log.debug("merging Ruoli instance");
		try {
			Ruoli result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ruoli findById(Integer id) {
		log.debug("getting Ruoli instance with id: " + id);
		try {
			Ruoli instance = entityManager.find(Ruoli.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
