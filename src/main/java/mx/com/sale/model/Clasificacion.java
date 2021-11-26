package mx.com.sale.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clasificacion")
public class Clasificacion implements Serializable {
	/**
	 * dentificador unico del producto coplemento
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
	@SequenceGenerator(name = "seqGen", sequenceName = "clasificacion_id_seq", allocationSize = 1)
	private Long id;
	
    /**
     * Código del catálogo
     */
    @Column(nullable = false, unique = true, updatable = false)
    private String codigo;
    
    /**
     * Descripcion del catálogo
     */
    private  String descripcion;
    
    /**
     * Formato de salida catálogo en la vista
     */
    @Column(name="formatosalida",nullable = false)
    private  String formatoSalida;
    
    
    /**
     * Fecha de registro del catálogo.
     */
    @Column(name="fecharegistro",nullable = false, updatable = false)
    private  Date fechaRegistro;
}
