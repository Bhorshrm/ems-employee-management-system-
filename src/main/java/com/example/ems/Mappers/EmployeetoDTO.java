package com.example.ems.Mappers;

import com.example.ems.DTO.EmployeeDTO;
import com.example.ems.model.Employee;

public class EmployeetoDTO {
    public EmployeeDTO mapemployeetoDTO(Employee e,EmployeeDTO ed){
        ed.setEmpId(e.getId());
        ed.setEmpName(e.getName());
        ed.setDepartment(e.getDepartment());
        ed.setEmail(e.getEmail());
        ed.setStatus(e.getStatus());
        return ed;
    }
}
