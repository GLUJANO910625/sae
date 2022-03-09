package mx.com.sale.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sale.model.ListaPrecio;
import mx.com.sale.repository.ListaPrecioRepository;
import mx.com.sale.service.ListaPrecioService;

@Service
public class ListaPrecioServiceImpl implements ListaPrecioService {
	private final Logger log = LoggerFactory.getLogger(ListaPrecioServiceImpl.class);

	@Autowired
	ListaPrecioRepository lpRepository;

	@Override
	public List<ListaPrecio> list() {
		// TODO Auto-generated method stub
		return lpRepository.findAll();
	}

	@Override
	@Transactional
	public ListaPrecio save(ListaPrecio listaPrecio) {
		// TODO Auto-generated method stub
		listaPrecio.setFechaRegistro(new Date());
		
		lpRepository.save(listaPrecio);

		log.info("Se guardo correctamente la lista de precio con codigo=> " + listaPrecio.getCodigo());

		return listaPrecio;
	}

	@Override
	@Transactional
	public ListaPrecio update(ListaPrecio listaPrecio) {
		// TODO Auto-generated method stub
		lpRepository.save(listaPrecio);

		log.info("Se actualizo correctamente la lista de precio con codigo=> " + listaPrecio.getCodigo());

		return listaPrecio;
	}

	@Override
	public ListaPrecio get(Long idListaPrecio) {
		// TODO Auto-generated method stub

		Optional<ListaPrecio> lp = lpRepository.findById(idListaPrecio);
		
		return lp.get();
	}
}
