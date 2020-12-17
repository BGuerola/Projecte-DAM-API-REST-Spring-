package com.justaproject.dao;


import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.justaproject.modelo.Inscrito;

@Repository
public interface InscritoDAO extends CrudRepository<Inscrito,Integer>{

}
