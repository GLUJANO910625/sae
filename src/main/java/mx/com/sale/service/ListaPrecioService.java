package mx.com.sale.service;

import java.util.List;

import mx.com.sale.model.ListaPrecio;

public interface ListaPrecioService {
	public List<ListaPrecio> list();

	public ListaPrecio update(ListaPrecio listaPrecio);

	public ListaPrecio save(ListaPrecio listaPrecio);

	public ListaPrecio get(Long idListaPrecio);
}
