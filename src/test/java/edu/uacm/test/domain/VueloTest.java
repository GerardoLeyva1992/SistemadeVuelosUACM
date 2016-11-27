package edu.uacm.test.domain;


import java.sql.Timestamp;


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
import edu.uacm.domain.Vuelo;
import edu.uacm.domain.VueloRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class VueloTest {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	VueloRepository vr;
	

	@Autowired
	DataSource ds;
	@Test
	public void insertarVuelo(){
		Timestamp d2 = new java.sql.Timestamp(0);
		Timestamp d = new java.sql.Timestamp(0);
		Vuelo v=new Vuelo();
		v.setIdvuelo(100);
		v.setHorallegada(d);
		v.setHorasalida(d2);
		
		v.setAeropuerto_idaeropuerto(1);
		v.setAeropuerto_idaeropuerto2(4);
		v.setAvion_idavion(1);
		System.out.println(v.getHorallegada());
		vr.save(v);
		Assert.assertNotNull(v);
		
	
		
		
	}	

}
