package com.academic.management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "students")
@Data

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;   
    
    @Column(name = "full_name", nullable = false)
    private String fullname;

    @Column(precision = 4)
    private Double grade;
}
