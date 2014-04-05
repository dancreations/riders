package com.riders.vos;

import java.util.Date;

public class ItemPagoVO {

	private int idPago;
	
	private FacturaVO factura;
	
	private Date fecha;
	
	private double importePago;
	
	private double importeDebe;
	
	private CuentaCorrienteVO cuenta;

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public FacturaVO getFactura() {
		return factura;
	}

	public void setFactura(FacturaVO factura) {
		this.factura = factura;
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

	public CuentaCorrienteVO getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaCorrienteVO cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
}
