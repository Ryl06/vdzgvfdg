package com.api.taller.controladores;

import java.util.List;
import com.api.taller.controladores.ListaReproduccionControlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.taller.entidades.ListaReproduccion;
import com.api.taller.servicios.ListaServicio;


@RestController
public class ListaReproduccionControlador {
	
	@Autowired ListaServicio servicio;
	
	//MUESTRA TODAS LAS LISTA DE REPRODUCCIONES
	@GetMapping("/lists")
	public List<ListaReproduccion> ListarReproduccion(){
		return servicio.listaReproduccion();
	}
	
	
	//MUESTRA LA LISTA DE REPRODUCCION SEGUN EL ID
//	@GetMapping("/lists/{name}")
//	public ResponseEntity <ListaReproduccion> listaReproduccionName(@PathVariable("name") String name){
//		return servicio.listaName(name);
//	}
	
	
	
	//INSERTA UNA LISTA NUEVA
	@PostMapping("/lists")
	public void crearLista(@RequestBody ListaReproduccion lista){
		servicio.crearLista(lista);
	}
	
	//Actualizar la lista
	@PutMapping("/lists/{listName} ")
	public void actualizarLista(@PathVariable ListaReproduccion lista){
		servicio.crearLista(lista);
	}
}































