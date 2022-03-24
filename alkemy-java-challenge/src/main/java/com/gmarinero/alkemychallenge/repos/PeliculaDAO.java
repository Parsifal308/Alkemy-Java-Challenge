package com.gmarinero.alkemychallenge.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gmarinero.alkemychallenge.entities.Pelicula;

@Repository
public interface PeliculaDAO extends JpaRepository<Pelicula, Long>{

	List<Pelicula> findByTitulo(String titulo);
	List<Pelicula> findByGeneroId(Long generoId);
	
	@Query(value="SELECT * FROM pelicula", nativeQuery=true)
	List<Pelicula> findAllAndOrder(String order);
}
