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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	@JsonIgnoreProperties(value="peliculas")
	private List<Personaje> personajes;
	
	@ManyToOne()
    @JoinColumn(name = "generoId")
    private Genero genero;

	public Long getPeliculaId() {
		return peliculaId;
	}

	public void setPeliculaId(Long peliculaId) {
		this.peliculaId = peliculaId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public List<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
