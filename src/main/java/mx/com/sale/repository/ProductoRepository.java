package mx.com.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.sale.model.Producto;

@Repository("productoRepository")
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
