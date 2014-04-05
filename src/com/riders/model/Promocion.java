package com.riders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "promocion")
public class Promocion {
	
	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_promocion_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_promocion", unique = true, nullable = true)
	private Integer idPromocion;
	
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "precio_unitario")
	private Integer precioUnitario;
	
	@Column(name = "precio_unico")
	private Integer precioUnico;
	
	@Column(name = "id_estado")
	private Integer idEstado;
	
	@Column(name = "cantidad")
	private Integer cantidad;

	public Integer getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(Integer idPromocion) {
		this.idPromocion = idPromocion;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Integer precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Integer getPrecioUnico() {
		return precioUnico;
	}

	public void setPrecioUnico(Integer precioUnico) {
		this.precioUnico = precioUnico;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
	

}
