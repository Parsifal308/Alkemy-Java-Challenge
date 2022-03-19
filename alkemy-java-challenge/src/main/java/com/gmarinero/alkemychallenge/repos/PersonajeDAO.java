package com.gmarinero.alkemychallenge.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gmarinero.alkemychallenge.entities.Personaje;

public interface PersonajeDAO extends JpaRepository<Personaje, Long>{

}
