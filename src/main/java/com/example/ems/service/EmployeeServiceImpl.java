package com.example.ems.service;

import com.example.ems.DTO.EmployeeDTO;
import com.example.ems.model.Employee;
import com.example.ems.repository.EmployeeRepository;
import com.example.ems.Mappers.EmployeetoDTO;
public class EmployeeServiceImpl {
    EmployeeRepository er;
    EmployeetoDTO edto;
    public EmployeeDTO getEmployeeById(String empId){
        EmployeeDTO ed= new EmployeeDTO();
        @SuppressWarnings("deprecation")
        Employee e=er.getById(empId);
        return edto.mapemployeetoDTO(e,ed);
    }
    
}
