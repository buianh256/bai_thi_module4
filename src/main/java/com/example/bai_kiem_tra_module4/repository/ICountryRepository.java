package com.example.bai_kiem_tra_module4.repository;

import com.example.bai_kiem_tra_module4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Country, Long> {
}
