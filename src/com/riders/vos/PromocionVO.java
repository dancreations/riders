package com.riders.vos;

public class PromocionVO {

	private int idPromocion;
	
	private ProductoVO producto;
	
	private double precioUnitario;
	
	private double precioPromocion;
	
	private Integer estado;
	
	private int cantidad;

	public int getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	public ProductoVO getProducto() {
		return producto;
	}

	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getPrecioPromocion() {
		return precioPromocion;
	}

	public void setPrecioPromocion(double precioPromocion) {
		this.precioPromocion = precioPromocion;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
