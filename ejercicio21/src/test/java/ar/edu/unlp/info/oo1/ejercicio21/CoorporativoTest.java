package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoorporativoTest {
	private Coorporativo c1;
	private Local eL;
	private Internacional eI;
	private Interurbano eU1,eU2;
	private DateLapse periodo,p2;
	
	@BeforeEach
	void setUp() {
		c1= new Coorporativo ("Coca","Ranelagh","1536723");
		eL= new Local(LocalDate.of(2025, 1, 1),"50 y 1","60 y 1",300,1,true);
		eI= new Internacional(LocalDate.of(2025, 2, 1),"50 y 1","60 y 1",300,1,false);
		eU1= new Interurbano(LocalDate.of(2025, 3, 1),"50 y 1","60 y 1",300,1);
		eU2= new Interurbano(LocalDate.of(2024, 1, 1),"50 y 1","60 y 1",300,1);
		periodo = new DateLapse(LocalDate.of(2025,1,1),LocalDate.of(2025,12,1));
		p2 = new DateLapse(LocalDate.of(2000, 1, 1),LocalDate.of(2000, 2, 2));
		c1.agregarEnvio(eL);
		c1.agregarEnvio(eI);
		c1.agregarEnvio(eU1);
		c1.agregarEnvio(eU2);
	}
	
	@Test
	void testMontoAPagar() {
		assertEquals (10500,c1.montoAPagar(periodo));
		assertEquals(0,c1.montoAPagar(p2));
	}
	
	@Test 
	void testAgregarEnvio() {
		assertEquals(4,c1.getSize());
	}
}
