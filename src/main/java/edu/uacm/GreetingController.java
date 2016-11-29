package edu.uacm;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.uacm.domain.Aeropuerto;
import edu.uacm.domain.AeropuertoRepository;

@Controller
@RequestMapping("/static")
public class GreetingController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AeropuertoRepository rp;
	//TODO
	@RequestMapping(value="",method=RequestMethod.GET)
	public String ListPosts(Model model){
		model.addAttribute("static",rp.findAll());
		return "static/index";
		
	}
	@RequestMapping(value="/dandoAlta", method=RequestMethod.POST)
	public String darAlta(@ModelAttribute  Aeropuerto ae) throws IOException{
		log.debug("-----Dando de alta: -------");
		
		rp.save(ae);
	    return "redirect:/exitoAlta.html";
	}
	
	
	
 
    
}
