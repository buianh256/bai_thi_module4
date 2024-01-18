package com.example.bai_kiem_tra_module4.repository;

import com.example.bai_kiem_tra_module4.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository  extends JpaRepository<City, Long> {
}
