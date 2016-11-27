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
import edu.uacm.domain.Escala;
import edu.uacm.domain.EscalaRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration
public class EscalaTest {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EscalaRepository esr;
	

	@Autowired
	DataSource ds;
	@Test
	public void insertarEscala(){
		Timestamp d2 = new java.sql.Timestamp(0);
		Timestamp d = new java.sql.Timestamp(0);
		Escala es=new Escala();
		es.setIdescala(10);
		es.setHorasalida(d2);
		es.setHorallegada(d);
		es.setVuelo_idvuelo(100);
		es.setAeropuerto_idaeropuerto(1);
		es.setAeropuerto_idaeropuerto2(4);
		esr.save(es);
		Assert.assertNotNull(es);
		
	
		
		
	}	

}
