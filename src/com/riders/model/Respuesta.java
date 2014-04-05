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
@Table(name = "respuesta")
public class Respuesta {

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_respuesta_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_respuesta", unique = true, nullable = true)
	private Integer idRespuesta;
	
	@Column(name = "id_consulta")
	private Integer idConsulta;
	
	@Column(name = "texto")
	private Integer texto;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "hora")
	private Time hora;
	
	@Column(name = "id_vendedor")
	private Time idVendedor;

	public Integer getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(Integer idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Integer getTexto() {
		return texto;
	}

	public void setTexto(Integer texto) {
		this.texto = texto;
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

	public Time getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Time idVendedor) {
		this.idVendedor = idVendedor;
	}
	
	
	
	
	
}
