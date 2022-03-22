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
		try {
			pelicula = peliculaDAO.save(pelicula);
			return pelicula;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public Optional<Pelicula> buscarPeliculaPorId(Long id) throws Exception {
		try {
			Optional<Pelicula> pelicula = peliculaDAO.findById(id); 
			return pelicula;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Pelicula> buscarPelicula() throws Exception {
		try {
			List<Pelicula> pelicula = peliculaDAO.findAll(); 
			return pelicula;
		}catch(Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

	@Override
	public Pelicula actualizarPelicula(Long id, Pelicula pelicula) throws Exception {
		try {
			Optional<Pelicula> peliculaEncontrado = peliculaDAO.findById(id);
			Pelicula peliculaActualizado = peliculaEncontrado.get();
			peliculaActualizado = peliculaDAO.save(pelicula);
			return peliculaActualizado;
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public boolean eliminarPelicula(Long id) throws Exception {
		try {
			if(peliculaDAO.existsById(id)) { 	
				peliculaDAO.deleteById(id);
				return true;
			}else {								
				throw new Exception();
			}
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
