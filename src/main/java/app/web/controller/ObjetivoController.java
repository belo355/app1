package app.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import app.web.dao.Objetivo;
import app.web.dao.ObjetivoDao;

@Controller
public class ObjetivoController {
	
	@Autowired 
	private ObjetivoDao objetivoDao; 
	
	@ResponseBody
	@RequestMapping(value="/usuario/objetivo/{id}",method = RequestMethod.GET) 
	public Optional<Objetivo> findExperienciaIdUser(@PathVariable("id") Long id, Model model) {
		Optional<Objetivo> objetivo = objetivoDao.findById(id); 
		return objetivo; 
	}
	

}
