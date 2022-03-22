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

	public Long getPersonajeId() {
		return personajeId;
	}

	public void setPersonajeId(Long personajeId) {
		this.personajeId = personajeId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}
}
