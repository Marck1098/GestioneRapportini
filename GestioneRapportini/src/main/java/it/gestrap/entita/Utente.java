package it.gestrap.entita;

import org.springframework.stereotype.Component;

import it.gestrap.util.Costanti;

@Component
public class Utente {

	String cf;
	String profilo;
	String stato;

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getProfilo() {
		return profilo;
	}

	public void setProfilo(String profilo) {
		this.profilo = profilo;
	}

	public String getStato() {
		return stato;
	}

	public void setStato() {
		this.stato = Costanti.UTENTE_LOGGATO;
	}

	public void resetStato() {
		this.stato = Costanti.UTENTE_NON_LOGGATO;
	}

}
