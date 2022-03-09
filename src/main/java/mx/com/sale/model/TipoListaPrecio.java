package mx.com.sale.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TipoListaPrecio {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
	@SequenceGenerator(name = "seqGen", sequenceName = "tipo_lista_precio_id_seq", allocationSize = 1)
	private Long id;
	
    @Column(nullable = false, unique = true, updatable = false)
    private String codigo;
 
    private  String descripcion;
    
    @Column(name="formatosalida",nullable = false)
    private  String formatoSalida;
  
    @Column(name="fecharegistro",nullable = false, updatable = false)
    private  Date fechaRegistro;
}
