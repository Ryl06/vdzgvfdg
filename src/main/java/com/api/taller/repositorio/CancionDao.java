package com.api.taller.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.api.taller.entidades.Cancion;


public interface CancionDao extends CrudRepository<Cancion,Integer>{

}
