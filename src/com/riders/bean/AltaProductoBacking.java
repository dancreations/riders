package com.riders.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.riders.spring.servicios.ProductoService;
import com.riders.vos.ProductoVO;

@Component
@Scope("session")
@Qualifier("altaProductoBacking")
public class AltaProductoBacking {
	private ProductoVO producto = new ProductoVO();
	
	@Autowired
	private ProductoService productoService; 

	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}

	public ProductoVO getProducto() {
		return producto;
	}

	

	
}
