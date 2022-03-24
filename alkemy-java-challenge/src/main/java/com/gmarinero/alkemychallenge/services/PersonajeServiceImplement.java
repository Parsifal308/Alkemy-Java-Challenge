package com.gmarinero.alkemychallenge.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gmarinero.alkemychallenge.entities.Personaje;
import com.gmarinero.alkemychallenge.repos.PersonajeDAO;

@Service
public class PersonajeServiceImplement implements PersonajeService{

	@Autowired
	private PersonajeDAO personajeDAO;
	
	@Override
	public Personaje crearPersonaje(Personaje personaje) throws Exception {
		try {
			personaje = personajeDAO.save(personaje);
			return personaje;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Optional<Personaje> buscarPersonajePorId(Long id) throws Exception {
		try {
			Optional<Personaje> personaje = personajeDAO.findById(id); 
			return personaje;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Personaje> buscarPersonajes() throws Exception {
		try {
			List<Personaje> personaje = personajeDAO.findAll(); 
			return personaje;
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

	@Override
	public Personaje actualizarPersonaje(Long id, Personaje personaje) throws Exception {
		try {
			Optional<Personaje> personajeEncontrado = personajeDAO.findById(id);
			Personaje personajeActualizado = personajeEncontrado.get();
			personajeActualizado = personajeDAO.save(personaje);
			return personajeActualizado;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public boolean eliminarPersonaje(Long id) throws Exception {
		try {
			if(personajeDAO.existsById(id)) { 	
				personajeDAO.deleteById(id);
				return true;
			}else {								
				throw new Exception();
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	
	
	@Override
	public List<Personaje> findByName(String username) throws Exception {
		try {
			List<Personaje> personaje = personajeDAO.findByNombre(username); 
			return personaje;
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

	@Override
	public List<Personaje> findByAge(Long age) throws Exception {
		try {
			List<Personaje> personaje = personajeDAO.findByEdad(age); 
			return personaje;
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

	@Override
	public List<Personaje> findByMovie(Long movieId) throws Exception {
		try {
			List<Personaje> personaje = personajeDAO.findByPeliculas(movieId); 
			return personaje;
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

}
