package com.spring5.practice.controllers;


import com.spring5.practice.model.EmployeInfo;
import com.spring5.practice.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeContoller {

    @Autowired
    EmployeService employeeService;



    @GetMapping("/emp/add")
    public String getAddEmpPage(Model model) {
        model.addAttribute("pageTitle", "Add Emp");
        model.addAttribute("employeInfo", new EmployeInfo());
        model.addAttribute("message", "Add a new Employee");

        return "emp/add";

    }

    @PostMapping("/emp/add")
    public String addEmploye(Model model, @ModelAttribute(name = "employeInfo") EmployeInfo employeInfo) {
        employeeService.addEmployee(employeInfo);
        model.addAttribute("message", "Emp added successfully");

        return "redirect:/emp/show-all";

    }

    @GetMapping("/emp/show-all")
    public String showAllEmployee(Model model) {
        model.addAttribute("pageTitle", "Wmployee List");
        model.addAttribute("employewList", employeeService.getAllEmployee());
        model.addAttribute("message", "Showing all employee...");

        return "/emp/show-all";
    }
}
