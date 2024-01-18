package com.example.bai_kiem_tra_module4.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "citys")
@Data
@Validated
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    @NotNull
    private Long area;

    @NotNull
    private Long population;

    @NotNull
    private Long GDP;

    @NotEmpty
    private String introduce;

    @ManyToOne
    private Country country;
}
