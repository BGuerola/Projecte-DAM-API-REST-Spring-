package com.justaproject.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.justaproject.modelo.OfertaTrabajo;

@Repository
public interface OfertaTrabajoDAO extends CrudRepository<OfertaTrabajo, Integer>{

}
