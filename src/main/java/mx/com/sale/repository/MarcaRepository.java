package mx.com.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.sale.model.Marca;

@Repository("clasificacionRepository")
public interface MarcaRepository extends JpaRepository<Marca, Long>{
   
}
