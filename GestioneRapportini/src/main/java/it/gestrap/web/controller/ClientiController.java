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
@RequestMapping("/clienti")
public class ClientiController {

    @Autowired
    private ClientiService clientiService;
    
    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List < Clienti > theCustomers = clientiService.getClienti();
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Clienti theCustomer = new Clienti();
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Clienti theCustomer) {
    	clientiService.saveClienti(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
        Model theModel) {
        Clienti theCustomer = clientiService.getCliente(theId);
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int theId) {
    	clientiService.deleteClienti(theId);
        return "redirect:/customer/list";
    }
    
    
}
