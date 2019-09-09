package app.web.dao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Data 
@Repository
public class Objetivo {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id; 
	
	public String descricao; 

}
