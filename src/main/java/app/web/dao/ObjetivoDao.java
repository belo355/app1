package app.web.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ObjetivoDao extends JpaRepository<Objetivo, Long> { 
	
	Optional<Objetivo> findById(Long id); 

}