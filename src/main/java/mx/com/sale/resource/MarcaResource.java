package mx.com.sale.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.sale.model.Marca;
import mx.com.sale.service.MarcaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/marca")
public class MarcaResource {
	@Autowired
	MarcaService marcaService;

	@GetMapping("/list")
	public List<Marca> listaMarcas() {
		return marcaService.list();
	}
}
