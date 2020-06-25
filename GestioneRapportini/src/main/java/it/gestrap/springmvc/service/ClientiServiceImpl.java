package it.gestrap.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.gestrap.DAO.ClientiDao;
import it.gestrap.entita.Clienti;

@Service
public class ClientiServiceImpl implements ClientiService {

    @Autowired
    private ClientiDao clientiDAO;

    @Override
    @Transactional
    public  List < Clienti > getClienti() {
        return clientiDAO.getClienti();
    }

    @Override
    @Transactional
    public void saveClienti(Clienti theCustomer) {
        clientiDAO.saveCliente(theCustomer);
    }

    @Override
    @Transactional
    public Clienti getCliente(int theId) {
        return clientiDAO.getCliente(theId);
    }

    @Override
    @Transactional
    public void deleteClienti(int theId) {
        clientiDAO.deleteCliente(theId);
    }
    
}
