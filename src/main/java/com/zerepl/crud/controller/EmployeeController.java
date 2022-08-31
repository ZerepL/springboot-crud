package com.zerepl.crud.controller;

import com.zerepl.crud.entity.Employee;
import com.zerepl.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping(path = "/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.delete(id);
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



}
