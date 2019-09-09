package app.web.dao;
//package app.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Repository;
//
//import app.app.web.model.Usuario;
//
//@Repository
//public class UsarioDaoImpl implements UsuarioDao {
//
//	@Autowired
//	private EntityManager em; 
//	
//	@Override
//	@Bean
//	public Usuario findById(Long id) {
//		Usuario usuario = em.find(Usuario.class, id); 
//		return usuario; 
//	}
//
//	@Override
//	public List<Usuario> findAll() {
//		List<Usuario> usuarios = ((UsarioDaoImpl) em).findAll(); 
//		return usuarios;
//	}
//
//	@Override
//	public void save(Usuario dadosPessoais) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteById(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void update(Usuario t) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
