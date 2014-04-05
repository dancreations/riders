package com.riders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "carro_compras")
public class CarroCompra {

	
	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_carro_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_carro", unique = true, nullable = true)
	private Integer id_carro;
	
	@Column(name = "id_cliente")
	private int id_cliente;
	
	@Column(name = "id_factura")
	private int id_factura;
	
	@Column(name = "id_estado")
	private int id_estado;
	
	@Column(name = "total")
	private double total;

	public Integer getId_carro() {
		return id_carro;
	}

	public void setId_carro(Integer id_carro) {
		this.id_carro = id_carro;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_factura() {
		return id_factura;
	}

	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
