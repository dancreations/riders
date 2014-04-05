package com.riders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "cuenta_corriente")
public class CuentaCorriente {

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "id_cuenta_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "id_cuenta", unique = true, nullable = true)
	private Integer idCuenta;

	@Type(type="com.riders.model.Factura")
	@ForeignKey(name = "id_factura")
	private Factura factura;

	@Column(name = "debe_total")
	private double debeTotal;

	public Integer getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public double getDebeTotal() {
		return debeTotal;
	}

	public void setDebeTotal(double debeTotal) {
		this.debeTotal = debeTotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}
