package com.riders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "item_carro")

public class ItemCarro {

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_item_carro_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_item", unique = true, nullable = true)
	private Integer idItem;
	
	@Column(name = "id_carro")
	private Integer idCarro;
	
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "precio_unitario")
	private Integer precioUnitario;
	
	@Column(name = "id_promocion")
	private Integer idPromocion;

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Integer getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Integer precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Integer getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(Integer idPromocion) {
		this.idPromocion = idPromocion;
	}
	
	
	
}
