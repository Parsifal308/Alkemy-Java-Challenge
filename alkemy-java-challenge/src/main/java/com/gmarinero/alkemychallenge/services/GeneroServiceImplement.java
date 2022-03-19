package com.gmarinero.alkemychallenge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gmarinero.alkemychallenge.entities.Genero;
import com.gmarinero.alkemychallenge.repos.GeneroDAO;

@Service
public class GeneroServiceImplement implements GeneroService{

	@Autowired
	private GeneroDAO generoDAO;
	
	@Override
	public Genero crearGenero(Genero genero) throws Exception {
		try {
			genero = generoDAO.save(genero);
			return genero;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Optional<Genero> buscarGeneroPorId(Long id) throws Exception {
		try {
			Optional<Genero> genero = generoDAO.findById(id); 
			return genero;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Genero> buscarGeneros() throws Exception {
		try {
			List<Genero> genero = generoDAO.findAll(); 
			return genero;
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

	@Override
	public Genero actualizarGenero(Long id, Genero genero) throws Exception {
		try {
			Optional<Genero> generoEncontrado = generoDAO.findById(id);
			Genero generoActualizado = generoEncontrado.get();
			generoActualizado = generoDAO.save(genero);
			return generoActualizado;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public boolean eliminarGenero(Long id) throws Exception {
		try {
			if(generoDAO.existsById(id)) { 	
				generoDAO.deleteById(id);
				return true;
			}else {								
				throw new Exception();
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
