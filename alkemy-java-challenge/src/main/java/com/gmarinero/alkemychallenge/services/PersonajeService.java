package com.gmarinero.alkemychallenge.services;

import java.util.List;
import java.util.Optional;
import com.gmarinero.alkemychallenge.entities.Personaje;

public interface PersonajeService {
	public Personaje crearPersonaje(Personaje personaje) throws Exception;
	public Optional<Personaje> buscarPersonajePorId(Long id) throws Exception;
	public List<Personaje> buscarPersonajes() throws Exception;
	public Personaje actualizarPersonaje(Long id, Personaje personaje) throws Exception;
	public boolean eliminarPersonaje(Long id) throws Exception;
	
	public List<Personaje> findByName(String name) throws Exception;
	public List<Personaje> findByAge(int age) throws Exception;
	public List<Personaje> findByMovie(Long movieId) throws Exception;
}
