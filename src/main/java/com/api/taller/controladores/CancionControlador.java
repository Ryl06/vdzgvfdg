package com.api.taller.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.taller.entidades.Cancion;
import com.api.taller.entidades.ListaReproduccion;
import com.api.taller.servicios.CancionServicio;
import com.api.taller.servicios.ListaServicio;

@RestController
public class CancionControlador {
	
	@Autowired CancionServicio servicio;
	
	//MUESTRA TODAS LAS LISTA DE REPRODUCCIONES
	@GetMapping("/songs")
	public List<Cancion> ListarCancion(){
		return servicio.listaCancion();
	}
	
	//INSERTA UNA LISTA NUEVA
	@PostMapping("/songs")
	public void crearCancion(@RequestBody Cancion lista){
		servicio.crearCancion(lista);
	}
}
