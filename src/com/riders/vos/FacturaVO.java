package com.riders.vos;

import java.util.Date;

public class FacturaVO {

	private int idFactura;
	
	private char tipo;
	
	private Date fecha;
	
	private double importeTotal;
	
	private CarroCompraVO carro;

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public CarroCompraVO getCarro() {
		return carro;
	}

	public void setCarro(CarroCompraVO carro) {
		this.carro = carro;
	}
	
		
	
}
