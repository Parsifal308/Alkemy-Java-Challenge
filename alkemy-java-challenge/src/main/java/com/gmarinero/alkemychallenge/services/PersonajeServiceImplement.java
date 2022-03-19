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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Personaje> buscarPersonajePorId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personaje> buscarPersonajes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personaje actualizarPersonaje(Long id, Personaje personaje) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarPersonaje(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
