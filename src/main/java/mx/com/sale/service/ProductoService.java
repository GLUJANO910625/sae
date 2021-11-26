package mx.com.sale.service;

import java.util.List;

import mx.com.sale.model.Producto;

public interface ProductoService {
	public List<Producto> list();
	public Producto update(Producto producto);
	public Producto save(Producto producto);
	public Producto get(Long idProducto);
}
