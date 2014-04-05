package com.riders.vos;

public class ItemCarroVO {

	private int idItem;
	
	private CarroCompraVO carro;
	
	private ProductoVO producto;
	
	private int cantidad;
	
	private double precioUnitario;
	
	private PromocionVO promocion;

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public CarroCompraVO getCarro() {
		return carro;
	}

	public void setCarro(CarroCompraVO carro) {
		this.carro = carro;
	}

	public ProductoVO getProducto() {
		return producto;
	}

	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public PromocionVO getPromocion() {
		return promocion;
	}

	public void setPromocion(PromocionVO promocion) {
		this.promocion = promocion;
	}
	
	
}
