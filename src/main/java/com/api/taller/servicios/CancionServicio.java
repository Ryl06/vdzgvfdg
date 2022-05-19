package com.api.taller.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.taller.entidades.Cancion;
import com.api.taller.repositorio.CancionDao;

@Service
public class CancionServicio {

	@Autowired
	private CancionDao repositorio;
	
	public List<Cancion> listaCancion(){
		return (List<Cancion>) repositorio.findAll();
	}
	
	
	public void crearCancion(Cancion cancion){
		repositorio.save(cancion);
	}
}
