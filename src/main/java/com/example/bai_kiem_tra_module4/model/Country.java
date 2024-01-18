package com.example.bai_kiem_tra_module4.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "countrys")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
