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
import edu.uacm.domain.Tripulacion;
import edu.uacm.domain.TripulacionRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class TripulacionTest {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TripulacionRepository tr;
	

	@Autowired
	DataSource ds;
	@Test
	public void TripulacionInsertar(){
		Tripulacion t=new Tripulacion();
		t.setEmpleado_codigo(033);
		t.setVuelo_idvuelo(100);
		t.setPuesto("Capitan");
		tr.save(t);
		Assert.assertNotNull(t);
	
		
	
		
		
	}	

}