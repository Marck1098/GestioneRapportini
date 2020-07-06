package it.gestrap.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;


import it.gestrap.springmvc.service.DipendentiService;
import it.gestrap.springmvc.service.ProfiloService;
import it.gestrap.util.Costanti;
import it.gestrap.entita.Dipendenti;

@Controller
public class LoginController {

	@Autowired
	private DipendentiService service;
	@Autowired
	private ProfiloService pService;
	@Autowired
	private Utente utenteBean;

	@RequestMapping(value = "/loginPageOk", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView model = new ModelAndView(); 
		model.setViewName("loginPageOk");
		return model;
	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/verifica", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,   HttpServletResponse response,@ModelAttribute("loginBean")Utente loginbean,@RequestParam("cf") String cf,
			@RequestParam("password") String password) {
		ModelAndView model = new ModelAndView();

		System.out.println("cf: "+ cf);
		System.out.println("Password: "+ password);

		Dipendenti dipendete= service.getCf(cf);
		String prifiloDip=dipendete.getProfilo().getProfilo();
		int idDip=dipendete.getId();
		if(dipendete!=null) { 
			
			if(dipendete.getPassword().equals(password)) {

				model.setViewName("home");
				utenteBean.setId(idDip);
				utenteBean.setCf(cf);
				utenteBean.setProfilo(prifiloDip);
				utenteBean.setStato();
				request.getSession().setAttribute("utente",utenteBean);
				
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
	
	@RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
	public String logout(HttpServletRequest request,  HttpServletResponse response){
		ModelAndView model = new ModelAndView();
		model.addObject("lgo", "Logout effettuato con successo");
		utenteBean.setCf(null);
		utenteBean.setProfilo(null);
		utenteBean.resetStato();
		request.getSession().setAttribute("utente",utenteBean);
		return "indexLgo";
	}
	
	
}