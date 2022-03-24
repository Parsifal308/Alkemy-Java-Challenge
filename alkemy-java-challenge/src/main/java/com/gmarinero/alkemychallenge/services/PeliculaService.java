package com.gmarinero.alkemychallenge.services;

import java.util.List;
import java.util.Optional;
import com.gmarinero.alkemychallenge.entities.Pelicula;

public interface PeliculaService {
	public Pelicula crearPelicula(Pelicula pelicula) throws Exception;
	public Optional<Pelicula> buscarPeliculaPorId(Long id) throws Exception;
	public List<Pelicula> buscarPelicula() throws Exception;
	public Pelicula actualizarPelicula(Long id, Pelicula pelicula) throws Exception;
	public boolean eliminarPelicula(Long id) throws Exception;
	
	public List<Pelicula> findByName(String name) throws Exception;
	public List<Pelicula> findByGeneroId(Long generoId) throws Exception;
	public List<Pelicula> findAllAndOrder(String order) throws Exception;
}
