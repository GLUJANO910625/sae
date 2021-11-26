package mx.com.sale.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.sale.model.Clasificacion;
import mx.com.sale.service.ClasificacionService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
@RequestMapping("/clasificacion")
public class ClasificacionResource {
	@Autowired
	ClasificacionService clasificacionService;

	@GetMapping("/list")
	public List<Clasificacion> list() {
		return clasificacionService.list();
	}
}
