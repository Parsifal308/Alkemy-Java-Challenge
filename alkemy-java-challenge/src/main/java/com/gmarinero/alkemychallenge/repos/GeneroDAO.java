package com.gmarinero.alkemychallenge.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmarinero.alkemychallenge.entities.Genero;

@Repository
public interface GeneroDAO extends JpaRepository<Genero, Long> {

}
