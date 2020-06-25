package it.gestrap.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.gestrap.springmvc.service.ClientiService;

@Controller
public class HomeController {

	 @Autowired
	    private ClientiService clientiService;
	 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "index";
	}
	
	 @GetMapping("/delete")
	    public String deleteCustomer(@RequestParam("idClienti") int theId) {
		 clientiService.deleteClienti(theId);
	        return "redirect:/index";
	    }
}
