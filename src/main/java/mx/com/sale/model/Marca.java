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
@Table(name = "marca")
public class Marca implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
	@SequenceGenerator(name = "seqGen", sequenceName = "marca_id_seq", allocationSize = 1)
	private Long id;
	

    @Column(nullable = false, unique = true, updatable = false)
    private String codigo;
 
    private  String descripcion;
    

    @Column(name="formatosalida",nullable = false)
    private  String formatoSalida;
  
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean activo;
    

    @Column(name="fecharegistro",nullable = false, updatable = false)
    private  Date fechaRegistro;
}
