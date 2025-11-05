package ar.edu.unlp.info.oo1.ejercicio21;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FisicoTest {
	private Fisico f1;
	private Local eL;
	private Internacional eI;
	private Interurbano eU1,eU2;
	private DateLapse periodo,p2;
	
	@BeforeEach
	void setUp() {
		f1= new Fisico ("Oli","Hudson",47221399);
		eL= new Local(LocalDate.of(2025, 1, 1),"50 y 1","60 y 1",300,1,true);
		eI= new Internacional(LocalDate.of(2025, 2, 1),"50 y 1","60 y 1",300,1,false);
		eU1= new Interurbano(LocalDate.of(2025, 3, 1),"50 y 1","60 y 1",300,1);
		eU2= new Interurbano(LocalDate.of(2024, 1, 1),"50 y 1","60 y 1",300,1);
		periodo = new DateLapse(LocalDate.of(2025,1,1),LocalDate.of(2025,12,1));
		p2 = new DateLapse(LocalDate.of(2000, 1, 1),LocalDate.of(2000, 2, 2));
		f1.agregarEnvio(eL);
		f1.agregarEnvio(eI);
		f1.agregarEnvio(eU1);
		f1.agregarEnvio(eU2);
	}
	
	@Test
	void testMontoAPagar() {
		assertEquals (9450,f1.montoAPagar(periodo));
		assertEquals(0,f1.montoAPagar(p2));
	}
	
	@Test 
	void testAgregarEnvio() {
		assertEquals(4,f1.getSize());
	}
}
