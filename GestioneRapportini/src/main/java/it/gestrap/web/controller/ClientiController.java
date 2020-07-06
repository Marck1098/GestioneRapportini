package it.gestrap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.gestrap.entita.Clienti;
import it.gestrap.springmvc.service.ClientiService;

@Controller
@RequestMapping("/cliente")
public class ClientiController { 

	@Autowired
	private ClientiService service;

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Clienti cliente = new Clienti();
		theModel.addAttribute("cliente", cliente);
		return "clienti-form";
	}

	@RequestMapping(value = "/saveClienti", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("dipendenti") Clienti cliente ) {
		ModelAndView theModel=new ModelAndView();
		try {
			if(cliente!=null && 
					!cliente.getNome().equals("") && 
					!cliente.getCodice().equals("") && 
					!cliente.getDescrizione().equals("") && 
					!cliente.getPiva().equals("")) {
				service.save(cliente);
				theModel.setViewName("redirect:/clienti");
			}
			else {
				theModel.setViewName("redirect:/cliente/showForm");
				theModel.addObject("cliente", cliente);
			}
		}
		catch(Exception e) {
			theModel.setViewName("clienti-form");
			theModel.addObject("msg", "Errore");
			theModel.addObject("cliente", cliente);
		}
		return theModel;
	}

	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("clienteId") int theId,
			Model theModel) {
		Clienti cliente = (Clienti) service.get(theId);
		theModel.addAttribute("cliente", cliente);
		return "clienti-form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("clienteId") int theId) {
		service.delete(theId);
		return "redirect:/clienti"; 
	}




}
