package com.codedecode.demo.controller;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repos.EmployeeCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    EmployeeCrudRepo empRepo;

    @GetMapping("/get/{empid}")
    public ResponseEntity<Employee> saveDate(@PathVariable("empid") Long id) {
        Employee employee = empRepo.findById(id).get();
        return new ResponseEntity<>( employee, HttpStatus.OK);
    }
}
