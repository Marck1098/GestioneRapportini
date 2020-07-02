package it.gestrap.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import it.gestrap.springmvc.service.DipendentiService;
import it.gestrap.springmvc.service.ProfiloService;
import it.gestrap.entita.Dipendenti;

@Controller
public class LoginController {

	@Autowired
	private DipendentiService service;
	@Autowired
	private ProfiloService pService;

	@RequestMapping(value = "/loginPageOk", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView(); 
		model.setViewName("loginPageOk");
		return model;
	}

	@RequestMapping(value = "/verifica", method = RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("cf") String cf,
			@RequestParam("password") String password) {
		ModelAndView model = new ModelAndView();

		System.out.println("cf: "+ cf);
		System.out.println("Password: "+ password);

		Dipendenti dipendete= service.getCf(cf);

		if(null!=dipendete) { 
			if(dipendete.getPassword().equals(password)) {

				model.addObject("cf", cf);
				String profilo=pService.get((dipendete.getProfilo()).getId()).getProfilo();

				if(profilo.equals("admin")) {
					model.setViewName("admin");
				}
				else if(profilo.equals("user")) {
					model.setViewName("user");
				}
				else {
					model.setViewName("login");
					model.addObject("msg", "Non hai assegnato alcun ruolo");
				}

			}
			else {
				model.setViewName("login");
				model.addObject("msg", "Password errata");
				System.out.println("Password errata.");
			}
		}
		else {
			model.setViewName("login");
			model.addObject("msg", "Utente non trovato");
			System.out.println("Utente inesistente.");
		}
		return model;
	}  
}