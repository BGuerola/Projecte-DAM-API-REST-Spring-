package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.justaproject.modelo.Experiencia;

@Repository
public interface ExperienciaDAO extends CrudRepository<Experiencia,Integer >{

}
