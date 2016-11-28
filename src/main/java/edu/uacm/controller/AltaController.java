package edu.uacm.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.uacm.domain.Aeropuerto;
import edu.uacm.domain.AeropuertoRepository;

@Controller
@RequestMapping("/daralta")
public class AltaController {
	
	@Autowired
	AeropuertoRepository aer;
	
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@RequestMapping(value="/redir", method=RequestMethod.GET)
	public String redireccionar() {
		log.debug("--------Estoy entrando a alta()------");
		return "redirect:/alta.html";
	}
	
	@RequestMapping(value="/dandoAlta", method=RequestMethod.POST)
	public String darAlta(@ModelAttribute Aeropuerto ae) throws IOException{
		log.debug("-----Dando de alta: -------");
		
		aer.save(ae);
	    return "redirect:/exitoAlta.html";
	}
	
	
}
