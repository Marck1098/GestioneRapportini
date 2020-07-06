package it.gestrap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.gestrap.entita.Clienti;
import it.gestrap.entita.Commesse;
import it.gestrap.entita.Dipendenti;
import it.gestrap.entita.Rapportini;
import it.gestrap.springmvc.service.ClientiService;
import it.gestrap.springmvc.service.CommesseService;
import it.gestrap.springmvc.service.DipendentiService;
import it.gestrap.springmvc.service.RapportiniService;

@Controller
public class ListController {

	@Autowired
	private ClientiService clientiService;
	@Autowired
	private DipendentiService dipendentiService;
	@Autowired
	private CommesseService commesseService;
	@Autowired
	private RapportiniService rapportiniService;

	@GetMapping("/clienti")
	public String listClienti(Model theModel) {
		List<Clienti> clienti = clientiService.getAll();
		theModel.addAttribute("clienti", clienti);
		return "list-clienti";
	}
	
	@GetMapping("/dipendenti")
	public String listDipendenti(Model theModel) {
		List<Dipendenti> dipendenti = dipendentiService.getAll();
		theModel.addAttribute("dipendenti", dipendenti);
		return "list-dipendenti";
	}
	
	@GetMapping("/commesse")
	public String listCommesse(Model theModel) {
		List<Commesse> commesse = commesseService.getAll();
		theModel.addAttribute("commesse", commesse);
		return "list-commesse";
	}
	
	@GetMapping("/rapportini")
	public String listRapportini(Model theModel) {
		List<Rapportini> rapportini = rapportiniService.getAll();
		theModel.addAttribute("rapportini", rapportini);
		return "list-rapportini";
	}
	
	
}
