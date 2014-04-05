package com.riders.vos;

public class CuentaCorrienteVO {

	private int idCuenta;
	
	private FacturaVO factura;
	
	private double debeTotal;

	public int getId_cuenta() {
		return idCuenta;
	}

	public void setId_cuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public FacturaVO getFactura() {
		return factura;
	}

	public void setFactura(FacturaVO factura) {
		this.factura = factura;
	}

	public double getDebeTotal() {
		return debeTotal;
	}

	public void setDebe_total(double debeTotal) {
		this.debeTotal = debeTotal;
	}
	
	
}
