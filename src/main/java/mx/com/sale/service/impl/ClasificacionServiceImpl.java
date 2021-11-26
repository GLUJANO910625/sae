package mx.com.sale.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sale.model.Clasificacion;
import mx.com.sale.repository.ClasificacionRepository;
import mx.com.sale.service.ClasificacionService;

@Service
public class ClasificacionServiceImpl implements ClasificacionService{
	private final Logger log = LoggerFactory.getLogger(ClasificacionServiceImpl.class);
	
	@Autowired
	ClasificacionRepository clasificacionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Clasificacion> list() {
		// TODO Auto-generated method stub
		log.info("Inicio consulta de listas de Marcas");
		return clasificacionRepository.findAll();
	}
}
