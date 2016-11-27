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
import edu.uacm.domain.Empleado;
import edu.uacm.domain.EmpleadoRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class EmpleadoTest {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmpleadoRepository er;
	

	@Autowired
	DataSource ds;
	
	
	@Test
	public void insertarPasajero3(){
	
		Empleado e =new Empleado();
		e.setCodigo(033);
		e.setNombre("Miguel");
		e.setApellidopaterno("Rosas");
		e.setApellidomaterno("Perez");
		e.setFechanacimiento("25/09/11");
		e.setNacionalidad("Mexicana");
		er.save(e);
		Assert.assertNotNull(e);
		
	
		
		
	}
}