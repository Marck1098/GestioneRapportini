package it.gestrap.springmvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import it.gestrap.DAO.ProfiloDao;
import it.gestrap.entita.Profilo;

public class ProfiloServiceImpl implements ProfiloService {

	@Autowired
	private ProfiloDao profiloDAO;

	@Override
	@Transactional
	public  List<Profilo> getAll() {
		return profiloDAO.getAll();
	}

	@Override
	@Transactional
	public void save(Profilo theCustomer) {
		profiloDAO.save(theCustomer);
	}

	@Override
	@Transactional
	public Profilo get(int theId) {
		return profiloDAO.get(theId);
	}

	@Override
	@Transactional
	public void delete(int theId) {
		profiloDAO.delete(theId);
	}
}