package com.gmarinero.alkemychallenge.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmarinero.alkemychallenge.entities.Personaje;

@Repository
public interface PersonajeDAO extends JpaRepository<Personaje, Long>{

	List<Personaje> findByNombre(String nombre);
	List<Personaje> findByEdad(Long edad);
	List<Personaje> findByPeliculas(Long peliculas);

}
