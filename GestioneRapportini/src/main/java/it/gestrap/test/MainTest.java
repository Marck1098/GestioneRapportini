package it.gestrap.test;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import it.gestrap.DAO.ClientiDaoImpl;
import it.gestrap.entita.Clienti;
import it.gestrap.springmvc.service.ClientiService;
import it.gestrap.springmvc.service.ClientiServiceImpl;


public class MainTest {
	

	
	public static void main(String[] args) {
		
		
		ClientiServiceImpl csi= new ClientiServiceImpl();
		
		
		System.out.println("ciao");

//			//METODO INSERT (Inserimento della sola colonna PK)
//			trasanzione = session.beginTransaction();
//			Clienti cliente1 = new Clienti();
//			cliente1.setCodice("ISP");
//			cliente1.setNome("Intesa Sanpaolo");
//			cliente1.setDescrizione("istituto bancario");
//			cliente1.setPiva("02316549632");
//			
			
		
			csi.deleteClienti(9);
			
			System.out.println("delete fatto");
	}

}
