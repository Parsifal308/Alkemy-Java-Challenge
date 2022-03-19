package com.gmarinero.alkemychallenge.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmarinero.alkemychallenge.entities.Pelicula;
import com.gmarinero.alkemychallenge.repos.PeliculaDAO;

@Service
public class PeliculaServiceImplement implements PeliculaService{

	@Autowired
	private PeliculaDAO peliculaDAO;
	
	@Override
	public Pelicula crearPelicula(Pelicula pelicula) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Pelicula> buscarPeliculaPorId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pelicula> buscarPelicula() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula actualizarPelicula(Long id, Pelicula pelicula) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarPelicula(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
