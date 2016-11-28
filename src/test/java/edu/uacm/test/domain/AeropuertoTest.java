package edu.uacm.test.domain;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.uacm.Application;
import edu.uacm.domain.Aeropuerto;
import edu.uacm.domain.AeropuertoRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class AeropuertoTest {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	DataSource ds;
	@Autowired
	AeropuertoRepository aer;	
	
	@Test
	public void insertarAeropuerto(){
		Aeropuerto ae=new Aeropuerto();
		ae.setIdaeropuerto(1);
		ae.setNombreaeropuerto("AeroMexico");
		ae.setCiudad("Ciudad de Mexico");
		ae.setPais("Mexico");
		aer.save(ae);
		Assert.assertNotNull(ae);
	}
	@Test
	public void insertarAeropuerto4(){
		Aeropuerto ae=new Aeropuerto();
		ae.setIdaeropuerto(4);
		ae.setNombreaeropuerto("AeroMadrid");
		ae.setCiudad("Real Madrid");
		ae.setPais("Espania");
		aer.save(ae);
		Assert.assertNotNull(ae);
	}

}
