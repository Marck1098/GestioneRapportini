package it.gestrap.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.gestrap.springmvc.service.ClientiService;

@Controller
public class HomeController {

	@Autowired
	private ClientiService service;
    
	@GetMapping("/")
	public ModelAndView wIndex(HttpServletRequest request,  HttpServletResponse response) {
		return new ModelAndView("index"); 
	}
	
	@GetMapping("/index")
	public ModelAndView index(HttpServletRequest request,  HttpServletResponse response) {
		return new ModelAndView("index"); 
	}

	@GetMapping("/login")
	public ModelAndView login() { 
		return new ModelAndView("login");
	}    


	@GetMapping("/list")
	public String liste() {
		return "liste";  
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";  
	}
}
