package com.example.ems.DTO;


import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;
import lombok.Data;

@Data
@Validated
public class EmployeeDTO {
    
    private String empId;
    @Size(max = 20,message = "Employee Name should be Less than 20")
    private String empName;
    @Email(message = "Enter Valid Email Address")
    private String email;
    private String department;
    private String status;
}
