package mx.com.sale.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sale.model.Marca;
import mx.com.sale.repository.MarcaRepository;
import mx.com.sale.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{
	private final Logger log = LoggerFactory.getLogger(MarcaServiceImpl.class);
	
	@Autowired
	MarcaRepository marcaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Marca> list() {
		// TODO Auto-generated method stub
		log.info("Inicio consulta de listas de Marcas");
		return marcaRepository.findAll();
	}
}
