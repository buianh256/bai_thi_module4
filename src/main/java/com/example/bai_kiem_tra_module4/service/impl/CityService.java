package com.example.bai_kiem_tra_module4.service.impl;

import com.example.bai_kiem_tra_module4.model.City;
import com.example.bai_kiem_tra_module4.repository.ICityRepository;
import com.example.bai_kiem_tra_module4.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepository cityRepository;
    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }
}
