package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private static final List<Employee> employees;

    static {
        employees = new ArrayList<>();
        employees.add(new Employee("Frodo Baggins", "Ring Bearer"));
        employees.add(new Employee("Bilbo Baggins", "Burglar"));
        employees.add(new Employee("Samwise Gamgee", "Gardener"));
    }

    @GetMapping("/dynamic")
    public String dynamic(Model model) {
        model.addAttribute("employees", this.employees);
        return "dynamic";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}