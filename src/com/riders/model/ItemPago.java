package com.riders.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "item_pago")
public class ItemPago {

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_item_pago_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_item", unique = true, nullable = true)
	private Integer idItem;
	
	@Column(name = "id_factura")
	private Integer idFactura;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "importe_pago")
	private double importePago;
	
	@Column(name = "importe_debe")
	private double importeDebe;
	
	@Column(name = "id_cuenta")
	private double idCuenta;

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImportePago() {
		return importePago;
	}

	public void setImportePago(double importePago) {
		this.importePago = importePago;
	}

	public double getImporteDebe() {
		return importeDebe;
	}

	public void setImporteDebe(double importeDebe) {
		this.importeDebe = importeDebe;
	}

	public double getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(double idCuenta) {
		this.idCuenta = idCuenta;
	}
	
	
	
	
	
}
