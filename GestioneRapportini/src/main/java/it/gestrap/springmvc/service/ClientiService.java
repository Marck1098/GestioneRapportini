package it.gestrap.springmvc.service;

import java.util.List;

import it.gestrap.entita.Clienti;

public interface ClientiService {

    public List < Clienti > getClienti();

    public void saveClienti(Clienti theCustomer);

    public Clienti getCliente(int theId);

    public void deleteClienti(int theId);
	

}
