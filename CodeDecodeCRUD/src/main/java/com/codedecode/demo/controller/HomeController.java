package com.codedecode.demo.controller;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repos.EmployeeCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    EmployeeCrudRepo empRepo;

    @GetMapping("/get/{empid}")
    public ResponseEntity<Employee> getDate(@PathVariable("empid") Long id) {
        Employee employee = empRepo.findById(id).get();
        return new ResponseEntity<>( employee, HttpStatus.OK);
    }

    @PostMapping("save2")
    public ResponseEntity<Employee> saveDate(@RequestBody Employee employee) {
        Employee employee1 = empRepo.save(employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
}
