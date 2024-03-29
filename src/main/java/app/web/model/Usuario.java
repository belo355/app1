package app.web.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data 
@Entity
public class Usuario {
	
		@Id 
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		private String nome; 
		private String Idade; 
		
		@OneToMany
		private List<Experiencia> experiencias; 

}

