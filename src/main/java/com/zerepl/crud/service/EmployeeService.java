package com.zerepl.crud.service;

import com.zerepl.crud.entity.Employee;
import com.zerepl.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee emp) {
        return employeeRepository.save(emp);
    }

    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    public Employee update(Employee employee) {
        Employee emp = employeeRepository.findById(employee.getId()).get();
        emp.setName(employee.getName());
        emp.setAge(employee.getAge());

        return employeeRepository.save(emp);
    }

    public String delete(int id) {
        employeeRepository.deleteById(id);
        return  "Entity " + id + " deleted";
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


}
