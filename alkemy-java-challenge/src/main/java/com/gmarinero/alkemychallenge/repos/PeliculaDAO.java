package com.gmarinero.alkemychallenge.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmarinero.alkemychallenge.entities.Pelicula;

public interface PeliculaDAO extends JpaRepository<Pelicula, Long>{

}
