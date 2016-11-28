package edu.uacm.test.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.uacm.Application;

@SpringApplicationConfiguration(classes=Application.class)
@WebAppConfiguration 
@RunWith(Suite.class)
@SuiteClasses({ AeropuertoTest.class, AvionTest.class, EmpleadoTest.class, EscalaTest.class, PasajeroTest.class,
		TripulacionTest.class, VueloTest.class })
public class AllTests {

}
