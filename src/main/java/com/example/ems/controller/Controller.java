package com.example.ems.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ems.DTO.EmployeeDTO;
import com.example.ems.service.EmployeeServiceImpl;
public class Controller{
    EmployeeServiceImpl es;
@GetMapping("/employee/{id}")
public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable String id){
    //retrieve DTO from service
    //then send it to client in responseEntity
    EmployeeDTO edto=es.getEmployeeById(id);
    return ResponseEntity.ok(edto);
}
}