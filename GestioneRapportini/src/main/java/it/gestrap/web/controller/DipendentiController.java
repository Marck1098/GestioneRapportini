package it.gestrap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.gestrap.entita.Dipendenti;
import it.gestrap.springmvc.service.DipendentiService;

@Controller
@RequestMapping("/dipendenti")
public class DipendentiController { 

	@Autowired
	private DipendentiService service;

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Dipendenti dipendente = new Dipendenti();
		theModel.addAttribute("dipendente", dipendente);
		return "dipendenti-form";
	}

	@RequestMapping(value = "/saveDipendente", method = RequestMethod.POST)
	public ModelAndView saveDipendenti(@ModelAttribute("dipendente") Dipendenti dipendente ) {
		ModelAndView theModel=new ModelAndView();
		try {
			if(dipendente!=null && 
					!dipendente.getMatricola().equals("") && 
					!dipendente.getNome().equals("") && 
					!dipendente.getCognome().equals("") && 
					!dipendente.getCodfiscale().equals("") && 
					!dipendente.getPassword().equals("") && 
					!dipendente.getResidenza().equals("") && 
					!dipendente.getNumerotelefono().equals("")&& 
					dipendente.getStipendioannuo()!=0 && 
					!dipendente.getProfilo().equals(null) && 
					!dipendente.getRuoli().equals(null) && 
					!dipendente.getTipocontratto().equals(null) ) {
				service.save(dipendente);
				theModel.setViewName("redirect:/dipendenti");
			}
			else {
				theModel.setViewName("dipendenti-form");
				theModel.addObject("dipendente", dipendente);
			}
		}
		catch(Exception e) {
			theModel.setViewName("dipendenti-form");
			theModel.addObject("msg", "Errore");
			theModel.addObject("dipendente", dipendente);
		}
		return theModel;
	}

	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("dipendenteId") int theId,Model theModel) {
		Dipendenti dipendente = (Dipendenti) service.get(theId);
		theModel.addAttribute("dipendente", dipendente);
		return "dipendenti-form";
	}

	@GetMapping("/delete")
	public String deleteDipendenti(@RequestParam("dipendenteId") int theId) {
		service.delete(theId);
		return "redirect:/dipendenti";
	}




}
