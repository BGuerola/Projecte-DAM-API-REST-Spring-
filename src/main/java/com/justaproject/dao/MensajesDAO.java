package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.justaproject.modelo.Mensajes;

@Repository
public interface MensajesDAO extends CrudRepository<Mensajes, Integer>{

}
