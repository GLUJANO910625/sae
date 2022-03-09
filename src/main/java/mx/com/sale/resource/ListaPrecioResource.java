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

import mx.com.sale.model.ListaPrecio;
import mx.com.sale.service.ListaPrecioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/listaPrecio")
public class ListaPrecioResource {
	@Autowired
	ListaPrecioService listaPrecioService;

	@GetMapping("/list")
	public List<ListaPrecio> listaProductos() {
		return listaPrecioService.list();
	}
	
	@PostMapping("/saveUpdate")
	ListaPrecio saveUpdate (@RequestBody ListaPrecio listaPrecio) {
		if(listaPrecio.getId() == null) {
			return listaPrecioService.save(listaPrecio);
		}else {
			return listaPrecioService.update(listaPrecio);
		}
	}
	
	@GetMapping("/get/{id}")
	ListaPrecio get (@PathVariable("id") Long id) {
		return listaPrecioService.get(id);
	}
}
