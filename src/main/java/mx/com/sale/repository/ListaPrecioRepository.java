package mx.com.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.sale.model.ListaPrecio;

@Repository("listaPrecioRepository")
public interface ListaPrecioRepository extends JpaRepository<ListaPrecio, Long>{

}
