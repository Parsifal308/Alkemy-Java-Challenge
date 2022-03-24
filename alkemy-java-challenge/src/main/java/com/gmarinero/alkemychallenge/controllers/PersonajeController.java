package com.gmarinero.alkemychallenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gmarinero.alkemychallenge.entities.Personaje;
import com.gmarinero.alkemychallenge.services.PersonajeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "characters")
public class PersonajeController {
	
	@Autowired
	PersonajeService personajeService;
	
	@GetMapping("/all")
	ResponseEntity<?> buscarPersonajes(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeService.buscarPersonajes());
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@GetMapping("/byID/{id}")
	ResponseEntity<?> buscarPersonajePorId(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeService.buscarPersonajePorId(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	
	
	
	@GetMapping("/byName")
	ResponseEntity<?> buscarPersonajePorNombre(@RequestParam("name") String name){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeService.findByName(name));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	@GetMapping("/byAge")
	ResponseEntity<?> buscarPersonajePorEdad(@RequestParam("age") int age){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeService.findByAge(age));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	@GetMapping("/byMovie")
	ResponseEntity<?> buscarPersonajePorPelicula(@RequestParam("movie") Long movieId){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeService.findByMovie(movieId));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	
	
	@PostMapping("/")
	ResponseEntity<?> crearPersonaje(@RequestBody Personaje personaje) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeService.crearPersonaje(personaje));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@PutMapping("/{id}")
	ResponseEntity<?> actualizarPersonaje(@RequestBody Personaje personaje, @PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(personajeService.actualizarPersonaje(id, personaje));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<?> eliminarPersonaje(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(personajeService.eliminarPersonaje(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
}
