package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justaproject.modelo.EstudiosNoReglados;

@Repository
public interface EstudiosNoRegladosDAO extends CrudRepository<EstudiosNoReglados, Integer>{

}
