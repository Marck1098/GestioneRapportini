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
import it.gestrap.springmvc.service.ClientiService;

@Controller
public class ListController {

	@Autowired
	private ClientiService clientiService;

	@GetMapping("/clienti")
	public String listCustomers(Model theModel) {
		List<Clienti> clienti = clientiService.getAll();
		theModel.addAttribute("clienti", clienti);
		return "list-clienti";
	}
}
