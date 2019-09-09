package app.web.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.web.model.Experiencia;

@Repository
public interface ExperienciaDao extends JpaRepository<Experiencia, Long> {

	Optional<Experiencia> findById(Long id);
//		 List<Usuario> findAll(); 
//		 void save(Usuario dadosPessoais); 
//		 void deleteById(Long id); 
//		 void update(Usuario t);

//	Optional<Experiencia> findByIdUser(Usuario id_user);

}
