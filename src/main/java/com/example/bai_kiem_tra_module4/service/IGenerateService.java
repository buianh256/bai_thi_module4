package com.example.bai_kiem_tra_module4.service;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void remove(Long id);
}
