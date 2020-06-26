package it.gestrap.DAO;

import java.util.List;

import it.gestrap.entita.Profilo;

public interface ProfiloDao {
	
	List<Profilo> getAll();

	void save(Profilo cliente);

	Profilo get(int id);

	void delete(int id);

}
