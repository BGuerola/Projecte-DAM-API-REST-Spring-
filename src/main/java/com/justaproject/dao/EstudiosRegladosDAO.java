package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.justaproject.modelo.EstudiosReglados;

@Repository
public interface EstudiosRegladosDAO extends CrudRepository<EstudiosReglados, Integer>{

}
