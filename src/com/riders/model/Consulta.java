package com.riders.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "consulta")

public class Consulta {

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_consulta_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_consulta", unique = true, nullable = false)
	private Integer id_consulta;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "hora")
	private Time hora;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "id_cliente")
	private int id_cliente;

	public Integer getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(Integer id_consulta) {
		this.id_consulta = id_consulta;
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

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
}
