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

import it.gestrap.entita.Tipocommesse;

/**
 * Home object for domain model class Tipocommesse.
 * @see it.gestrap.DAO.Tipocommesse
 * @author Hibernate Tools
 */
@Stateless
public class TipocommesseHome {

	private static final Log log = LogFactory.getLog(TipocommesseHome.class);

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

	public void persist(Tipocommesse transientInstance) {
		log.debug("persisting Tipocommesse instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tipocommesse persistentInstance) {
		log.debug("removing Tipocommesse instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tipocommesse merge(Tipocommesse detachedInstance) {
		log.debug("merging Tipocommesse instance");
		try {
			Tipocommesse result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tipocommesse findById(Integer id) {
		log.debug("getting Tipocommesse instance with id: " + id);
		try {
			Tipocommesse instance = entityManager.find(Tipocommesse.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
