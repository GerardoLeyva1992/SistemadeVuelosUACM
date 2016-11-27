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
import edu.uacm.domain.Pasajero;
import edu.uacm.domain.PasajeroRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class PasajeroTest {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PasajeroRepository pr;
	

	@Autowired
	DataSource ds;
	
	
	@Test
	public void insertarPasajero3(){
	
		Pasajero p =new Pasajero();
		
		p.setFechanacimiento("23/09/55");
		p.setIdpasajero(003);
		p.setNombre("Gerardo");
		p.setApellidopaterno("Leyva");
		p.setApellidomaterno("Teutli");
		p.setNacionalidad("Mexicano");
		p.setVuelo_idvuelo(100);
		pr.save(p);
		Assert.assertNotNull(p);
		
		
	}
}