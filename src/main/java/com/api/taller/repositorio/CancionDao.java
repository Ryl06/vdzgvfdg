package com.api.taller.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.taller.entidades.Cancion;

@Repository
public interface CancionDao extends CrudRepository<Cancion,Long>{
	 long deleteByTitle(String title);
}
