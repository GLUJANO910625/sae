package mx.com.sale.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sale.model.Producto;
import mx.com.sale.repository.ProductoRepository;
import mx.com.sale.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	private final Logger log = LoggerFactory.getLogger(ProductoServiceImpl.class);

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> list() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		producto.setFechaRegistro(new Date());
		producto.setActivo(Boolean.TRUE);
		productoRepository.save(producto);

		log.info("Se guardo correctamente el producto con codigo=> " + producto.getCodigo());

		return producto;
	}

	@Override
	@Transactional
	public Producto update(Producto producto) {
		// TODO Auto-generated method stub
		productoRepository.save(producto);

		log.info("Se actualizo correctamente el producto con codigo=>" + producto.getCodigo());

		return producto;
	}

	@Override
	public Producto get(Long idProducto) {
		// TODO Auto-generated method stub

		Optional<Producto> producto = productoRepository.findById(idProducto);
		
		return producto.get();
	}
}
