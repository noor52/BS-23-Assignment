package com.spring5.practice.controllers;

import com.spring5.practice.model.BankAccunt;
import com.spring5.practice.model.EmployeInfo;
import com.spring5.practice.service.BankService;
import com.spring5.practice.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BankAccountController {

    @Autowired
    BankService bankService;

    @GetMapping("/bank/add")
    public String getAddBankAccPage(Model model) {
        model.addAttribute("pageTitle", "Add BankAccount");
        model.addAttribute("bankAccount", new BankAccunt());
        model.addAttribute("message", "Add a new BankAcccoujnt");

        return "bank/add";

    }

    @PostMapping("/bank/add")
    public String addBankAcc(Model model, @ModelAttribute(name = "bankAccount") BankAccunt bankAccount) {
        bankService.addBankAccount(bankAccount);
        model.addAttribute("message", "BankAcc added successfully");

        return "redirect:/bank/show-all";

    }

    @GetMapping("/bank/show-all")
    public String showAllBankAcc(Model model) {
        model.addAttribute("pageTitle", "Bank List");
        model.addAttribute("employewList", bankService.getAllBank());
        model.addAttribute("message", "Showing all Bnak ...");

        return "/bank/show-all";
    }
}
