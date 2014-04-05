package com.riders.vos;

public class CarroCompraVO {

	private int idCarro;

	private ClienteVO cliente;

	private FacturaVO factura;

	private Integer idEstado;

	private double total;

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public FacturaVO getFactura() {
		return factura;
	}

	public void setFactura(FacturaVO factura) {
		this.factura = factura;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
