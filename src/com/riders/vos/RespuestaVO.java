package com.riders.vos;

import java.sql.Time;
import java.util.Date;

public class RespuestaVO {

	private int idRespuesta;
	
	private ConsultaVO consulta;
	
	private String texto;
	
	private Date fecha;
	
	private Time hora;
	
	private VendedorVO vendedor;

	public int getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(int idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public ConsultaVO getConsulta() {
		return consulta;
	}

	public void setConsulta(ConsultaVO consulta) {
		this.consulta = consulta;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
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

	public VendedorVO getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorVO vendedor) {
		this.vendedor = vendedor;
	}
	
	
	
	
}
