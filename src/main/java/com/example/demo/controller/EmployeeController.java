package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping
    public String listEmployees(Model model){
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employees/list";
    }

    @GetMapping("/{id}")
    public String viewEmployee(@PathVariable int id, Model model){
        Employee e = employeeService.findById(id);
        model.addAttribute("employee", e);

        return "employees/view";
    }
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/form";
    }
    @PostMapping
    public String createEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees";
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteById(id);
        return "redirect:/employees";
    }
}
