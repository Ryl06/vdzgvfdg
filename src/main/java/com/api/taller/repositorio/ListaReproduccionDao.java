package com.api.taller.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.taller.entidades.ListaReproduccion;

@Repository
public interface ListaReproduccionDao extends CrudRepository<ListaReproduccion,Integer>{


}
