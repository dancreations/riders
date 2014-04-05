package com.riders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "domicilio")

public class Domicilio {

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_domicilio_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_domicilio", unique = true, nullable = false)
	private Integer idDomicilio;
	
	@Column(name = "calle")
	private String calle;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "localidad")
	private String localidad;
	
	@Column(name = "provincia")
	private String provincia;
	
	@Column(name = "codigo_postal")
	private String codigoPostal;

	public Integer getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
}
