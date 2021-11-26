package mx.com.sale.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.sale.model.Producto;
import mx.com.sale.service.ProductoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/producto")
public class ProductoResource {
	@Autowired
	ProductoService productoService;

	@GetMapping("/list")
	public List<Producto> listaProductos() {
		return productoService.list();
	}
	
	@PostMapping("/saveUpdate")
	Producto saveUpdate (@RequestBody Producto producto) {
		if(producto.getId() == null) {
			return productoService.save(producto);
		}else {
			return productoService.update(producto);
		}
	}
	
	@GetMapping("/get/{id}")
	Producto get (@PathVariable("id") Long id) {
		return productoService.get(id);
	}
}
