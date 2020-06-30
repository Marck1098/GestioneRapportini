package it.gestrap.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.gestrap.entita.Profilo;

@Repository
public class ProfiloDaoImpl implements ProfiloDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List < Profilo > getAll() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb =  session.getCriteriaBuilder();
		CriteriaQuery < Profilo > cq = cb.createQuery(Profilo.class);
		Root < Profilo > root = cq.from(Profilo.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void save(Profilo dipendente) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(dipendente);
	}

	@Override
	public Profilo get(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Profilo rapportino = currentSession.get(Profilo.class, id);
		return rapportino;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Profilo rapportino = session.byId(Profilo.class).load(id);
		session.delete(rapportino);
	}
}