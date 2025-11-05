package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LocalTest {

	private Local e1,e2;
	
	@BeforeEach
	void setUp() {
		e1= new Local(LocalDate.of(2025, 1, 1),"50 y 1","60 y 1",300,1,true);
		e2= new Local(LocalDate.of(2025, 1, 1),"50 y 1","60 y 1",300,1,false);
	}
	
	@Test
	void testCalcularPrecio() {
		assertEquals(1500,e1.calcularPrecio());
		assertEquals(1000,e2.calcularPrecio());
	}
	
}
