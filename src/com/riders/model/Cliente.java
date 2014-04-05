package com.riders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(name = "id_usuario")
public class Cliente extends Usuario {

	private static final long serialVersionUID = 1L;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "id_estado")
	private Integer estado;

	@Column(name = "razon_social")
	private String razonSocial;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "cuit_cuil")
	private String cuit;

	@Column(name = "id_cuenta")
	private CuentaCorriente cuentaCorriente;

	@Column(name = "id_domicilio")
	private Domicilio domicilio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

}
