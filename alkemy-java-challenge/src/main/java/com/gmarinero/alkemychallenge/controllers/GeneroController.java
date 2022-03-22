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
import org.springframework.web.bind.annotation.RestController;
import com.gmarinero.alkemychallenge.entities.Genero;
import com.gmarinero.alkemychallenge.services.GeneroService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "genres")
public class GeneroController {

	@Autowired
	GeneroService generoService;
	
	@GetMapping("/")
	ResponseEntity<?> buscarGeneros(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(generoService.buscarGeneros());
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@GetMapping("/{id}")
	ResponseEntity<?> buscarGeneroPorId(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(generoService.buscarGeneroPorId(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@PostMapping("/")
	ResponseEntity<?> guardarGenero(@RequestBody Genero genero) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(generoService.crearGenero(genero));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@PutMapping("/{id}")
	ResponseEntity<?> actualizarGenero(@RequestBody Genero genero, @PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(generoService.actualizarGenero(id, genero));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<?> eliminarGenero(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(generoService.eliminarGenero(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
}
