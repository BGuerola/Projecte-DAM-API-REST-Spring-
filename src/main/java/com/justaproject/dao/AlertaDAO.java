package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.justaproject.modelo.Alerta;

@Repository
public interface AlertaDAO extends CrudRepository<Alerta, Integer>{


}
