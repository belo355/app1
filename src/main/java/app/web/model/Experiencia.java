package app.web.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data 
@Entity
public class Experiencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	private String empresa;
	private String cargo; 
	private LocalDate periodo;
	
	@ManyToOne
	private Usuario usuario; 
	
	

}
