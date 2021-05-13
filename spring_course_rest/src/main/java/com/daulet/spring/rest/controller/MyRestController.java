package com.daulet.spring.rest.controller;

import com.daulet.spring.rest.entity.Employee;
import com.daulet.spring.rest.exeption_handing.EmployeeIncorrectData;
import com.daulet.spring.rest.exeption_handing.NoSuchEmployeeException;
import com.daulet.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        if (employee==null) {
            throw new NoSuchEmployeeException("There is no Employee with id=" + id + " in DataBase");
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){

        Employee employee = employeeService.getEmployee(id);
        if (employee==null) {
            throw new NoSuchEmployeeException("There is no Employee with id=" + id + " in DataBase");
        }

        employeeService.deleteEmployee(id);
        return "Employee with id=" + id + " was deleted";
    }
}
