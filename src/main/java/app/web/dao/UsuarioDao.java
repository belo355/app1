package app.web.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.web.model.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
	
	 Optional<Usuario> findById(Long id); 
//	 List<Usuario> findAll(); 
//	 void save(Usuario dadosPessoais); 
//	 void deleteById(Long id); 
//	 void update(Usuario t);
	 
}
