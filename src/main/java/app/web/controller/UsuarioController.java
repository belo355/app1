package app.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import app.web.dao.UsuarioDao;
import app.web.model.Usuario;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao; 

	@ResponseBody
	@RequestMapping(value="/usuario/{id}",method = RequestMethod.GET) 
	public Optional<Usuario> findUser(@PathVariable("id") Long id, Model model) {
		Optional<Usuario> usuario = usuarioDao.findById(id); 
		return usuario; 
	}
	
	@ResponseBody
	@RequestMapping(value="/usuarios",method = RequestMethod.GET) 
	public List<Usuario> FindAll(Model model) {
		List<Usuario> usuarios = usuarioDao.findAll(); 
		return usuarios; 
	}
	
	
}
