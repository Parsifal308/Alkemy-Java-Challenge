package com.gmarinero.alkemychallenge.entities;

import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
	
@Entity
@Data
@Table(name="pelicula")
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long peliculaId;
	
	@Column(name="imgUrl")
	private String imgUrl;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="calificacion")
	private int calificacion;
	
	@ManyToMany
	@JoinTable(	name="personaje_pelicula", joinColumns = @JoinColumn(name = "peliculaId"), inverseJoinColumns = @JoinColumn(name = "personajeId"))
	private List<Personaje> personajes;
	
	@ManyToOne()
    @JoinColumn(name = "generoId")
    private Genero genero;
	
}
