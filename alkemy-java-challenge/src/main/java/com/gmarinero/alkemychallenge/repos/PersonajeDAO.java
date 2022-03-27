package com.gmarinero.alkemychallenge.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gmarinero.alkemychallenge.entities.Personaje;

@Repository
public interface PersonajeDAO extends JpaRepository<Personaje, Long>{

	List<Personaje> findByNombre(String nombre);
	List<Personaje> findByEdad(int edad);
	
	@Query(	value = "SELECT * FROM personaje WHERE personaje.pelicula.peliculaId = :peliculaId", nativeQuery = true)
	List<Personaje> findByPeliculas(@Param("peliculaId") Long peliculaId);


}
