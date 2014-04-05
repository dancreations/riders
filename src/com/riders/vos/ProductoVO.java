package com.riders.vos;

public class ProductoVO {
	
	private int idProducto;
	
	private Integer estado;
	
	private String marca;
	
	private String nombre;
	
	private String descripcion;
	
	private double precio;
		
	private int codigoExterno;
	
	private String foto;

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(int codigoExterno) {
		this.codigoExterno = codigoExterno;
	}
	



}
