package com.api.taller.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.taller.entidades.ListaReproduccion;
import com.api.taller.repositorio.ListaReproduccionDao;

@Service
public class ListaServicio {
	
	@Autowired
	private ListaReproduccionDao repositorio;
	
	public List<ListaReproduccion> listaReproduccion(){
		return (List<ListaReproduccion>) repositorio.findAll();
	}
	
	
//	public ResponseEntity listaName(String name){
//		try {
//			ListaReproduccion lista=  repositorio.findByName(name).get();
//			return new ResponseEntity<ListaReproduccion>(lista,HttpStatus.OK);
//			
//		}catch(Exception e) {
//			return new ResponseEntity<ListaReproduccion>(HttpStatus.NOT_FOUND);
//		}
//	}
	
	public void crearLista(ListaReproduccion lista){
		repositorio.save(lista);
	}
	

	
}
