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
@RequestMapping("/cliente")
public class ClientiController { 

    @Autowired
    private ClientiService service;

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
    	Clienti theCustomer = new Clienti();
        theModel.addAttribute("cliente", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveClienti")
    public String saveCustomer(@ModelAttribute("dipendenti") Clienti cliente) {
    	service.save(cliente);
        return "redirect:/list/clienti";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("clienteId") int theId,
        Model theModel) {
    	Clienti cliente = (Clienti) service.get(theId);
        theModel.addAttribute("customer", cliente);
        return "clienti-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("clienteId") int theId) {
    	service.delete(theId);
        return "redirect:/list/clienti"; 
    }
    
    
    
    
}
