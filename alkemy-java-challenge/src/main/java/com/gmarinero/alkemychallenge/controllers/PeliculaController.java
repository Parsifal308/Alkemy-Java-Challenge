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
import com.gmarinero.alkemychallenge.entities.Pelicula;
import com.gmarinero.alkemychallenge.services.PeliculaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "movies")
public class PeliculaController {

	@Autowired
	PeliculaService peliculaService;
	
	@GetMapping("/")
	ResponseEntity<?> buscarPelicula(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(peliculaService.buscarPelicula());
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@GetMapping("/{id}")
	ResponseEntity<?> buscarPeliculaPorId(@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(peliculaService.buscarPeliculaPorId(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@PostMapping("/")
	ResponseEntity<?> crearPelicula(@RequestBody Pelicula pelicula) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(peliculaService.crearPelicula(pelicula));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@PutMapping("/{id}")
	ResponseEntity<?> actualizarPelicula(@RequestBody Pelicula pelicula, @PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(peliculaService.actualizarPelicula(id, pelicula));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<?> eliminarPelicula(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(peliculaService.eliminarPelicula(id));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("-->[Error] " + ex.getMessage());
		}
	}
	
	
	
	
	@GetMapping("/byName")
	ResponseEntity<?> buscarPeliculaPorNombre(@RequestParam("name") String name){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(peliculaService.findByName(name));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@GetMapping("/byGenre")
	ResponseEntity<?> buscarPeliculaPorGenero(@RequestParam("genre") Long genre){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(peliculaService.findByGeneroId(genre));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
	
	@GetMapping("/order")
	ResponseEntity<?> buscarPeliculaOrdenadas(@RequestParam("order") String order){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(peliculaService.findAllAndOrder(order));
		}catch(Exception ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("-->[Error] " + ex.getMessage());
		}
	}
}
