package mx.com.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.sale.model.Clasificacion;

@Repository("marcaRepository")
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long>{

}
