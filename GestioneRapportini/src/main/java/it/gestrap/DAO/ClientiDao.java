package it.gestrap.DAO;

import java.util.List;

import org.hibernate.Session;

import it.gestrap.entita.Clienti;

public interface ClientiDao {

    public List < Clienti > getClienti();

    public void saveCliente(Clienti theCustomer);

    public Clienti getCliente(int theId);

    public void deleteCliente(int theId);
    
}