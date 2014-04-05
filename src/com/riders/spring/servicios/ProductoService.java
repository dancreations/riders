package com.riders.spring.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riders.model.Producto;
import com.riders.model.dao.ProductoDAO;

@Service("productoService")
public class ProductoService {

	@Autowired
	private ProductoDAO productoDao;

	public ProductoService() {

	}

	public void guardarProducto(String nombre, String descripcion,
			String precio, String unidades, String foto, int idUsuario) {

		Producto producto = new Producto();
		producto.setNombre(nombre);
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		producto.setCantidad(new Integer(unidades));
		producto.setFoto(foto);
		producto.setIdUsuario(idUsuario);

		productoDao.create(producto);

	}

	public ProductoDAO getProductoDao() {
		return productoDao;
	}

	public void setProductoDao(ProductoDAO productoDao) {
		this.productoDao = productoDao;
	}

}
