package com.riders.vos;

public class ClienteVO extends UsuarioVO {

	private int idCliente;

	private String nombre;

	private String apellido;

	private String telefono;

	private String cuitCuil;

	private String razonSocial;

	private DomicilioVO domicilio;

	private Integer estado;

	private CuentaCorrienteVO cuenta;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCuitCuil() {
		return cuitCuil;
	}

	public void setCuitCuil(String cuitCuil) {
		this.cuitCuil = cuitCuil;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public DomicilioVO getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(DomicilioVO domicilio) {
		this.domicilio = domicilio;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public CuentaCorrienteVO getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCorrienteVO cuenta) {
		this.cuenta = cuenta;
	}

}
