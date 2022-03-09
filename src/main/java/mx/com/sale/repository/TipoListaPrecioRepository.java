package mx.com.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.sale.model.TipoListaPrecio;

@Repository("tipoListaPrecioRepository")
public interface TipoListaPrecioRepository extends JpaRepository<TipoListaPrecio, Long>{

}
