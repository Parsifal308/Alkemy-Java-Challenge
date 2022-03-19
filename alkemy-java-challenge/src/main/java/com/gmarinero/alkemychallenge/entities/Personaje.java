package com.gmarinero.alkemychallenge.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="personaje")
public class Personaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personajeId;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="peso")
	private float peso;
	
	@Column(name="historia")
	private String historia;
	
	@ManyToMany(mappedBy = "personajes")
	private List<Pelicula> peliculas;
}
