package com.example.ems.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId", insertable = false, unique = true, nullable = false)
    private final String id;
    @Column(name = "empName", nullable = false)
    private final String name;
    @Column(name = "emailId", nullable = false, unique = true)
    private final String email;
    @Column(name = "department", nullable = false, unique = false)
    private final String department;
    @Column(name = "status", nullable = false, unique = false)
    private final String status;
}
