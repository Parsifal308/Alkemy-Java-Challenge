package com.gmarinero.alkemychallenge.services;

import java.util.List;
import java.util.Optional;
import com.gmarinero.alkemychallenge.entities.Genero;

public interface GeneroService {
	public Genero crearGenero(Genero genero) throws Exception;
	public Optional<Genero> buscarGeneroPorId(Long id) throws Exception;
	public List<Genero> buscarGeneros() throws Exception;
	public Genero actualizarGenero(Long id, Genero genero) throws Exception;
	public boolean eliminarGenero(Long id) throws Exception;
}
