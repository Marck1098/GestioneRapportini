package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Profilo;

public interface ProfiloService {
	
	 public List<Profilo> getAll();

	    public void save(Profilo cliente);

	    public Profilo get(int id);

	    public void delete(int id);
}