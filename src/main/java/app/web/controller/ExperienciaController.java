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

import app.web.dao.ExperienciaDao;
import app.web.model.Experiencia;
//import app.web.model.Usuario;

@Controller 
public class ExperienciaController {
	
	@Autowired
	private ExperienciaDao experienciaDao;
	
	@ResponseBody
	@RequestMapping(value="/usuario/experiencia/{id}",method = RequestMethod.GET) 
	public Optional<Experiencia> findExperienciaIdUser(@PathVariable("id") Long id, Model model) {
		Optional<Experiencia> experienciaUser = experienciaDao.findById(id); 
		return experienciaUser; 
	}
	
	@ResponseBody
	@RequestMapping(value="/usuarios/experiencias",method = RequestMethod.GET) 
	public List<Experiencia> FindAllExperiencias(Model model) {
		List<Experiencia> experiencias = experienciaDao.findAll(); 
		return experiencias; 
	}
	
//	@ResponseBody
//	@RequestMapping(value="/usuarios/experiencias/{id}",method = RequestMethod.GET) 
//	public Optional<Experiencia> findExperienciaNameUser(@PathVariable("id") Usuario id, Model model) {
//		Optional<Experiencia> experiencaByUser = experienciaDao.findByIdUser(id); 
//		return experiencaByUser; 
//	}


}
