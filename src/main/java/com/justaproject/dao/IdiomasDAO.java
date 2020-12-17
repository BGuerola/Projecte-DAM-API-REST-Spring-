package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.justaproject.modelo.Idiomas;

@Repository
public interface IdiomasDAO extends CrudRepository <Idiomas,Integer>{

}
