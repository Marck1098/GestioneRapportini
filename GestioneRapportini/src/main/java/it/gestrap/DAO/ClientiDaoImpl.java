package it.gestrap.DAO;
// Generated 24 giu 2020, 11:04:10 by Hibernate Tools 5.1.10.Final

import java.util.List; 
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.gestrap.entita.Clienti;

@Repository
public class ClientiDaoImpl implements ClientiDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List < Clienti > getClienti() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb =  session.getCriteriaBuilder();
        CriteriaQuery < Clienti > cq = cb.createQuery(Clienti.class);
        Root < Clienti > root = cq.from(Clienti.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

   
    @Override
    public void saveCliente(Clienti theCustomer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public Clienti getCliente(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Clienti theCustomer = currentSession.get(Clienti.class, theId);
        return theCustomer;
    }
    
    @Override
    public void deleteCliente(int id) {
        Session session = sessionFactory.getCurrentSession();
        Clienti clienti = session.byId(Clienti.class).load(id);
        session.delete(clienti);
    }
    
}
