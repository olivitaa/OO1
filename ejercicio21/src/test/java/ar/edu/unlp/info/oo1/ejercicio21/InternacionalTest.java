package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InternacionalTest {
	private Internacional e1,e2,e3,e4,e5,e6;
	
	@BeforeEach
	void setUp() {
		e1=new Internacional(LocalDate.of(2025, 2, 1),"Argentina","Brasil",999,400,false);
		e2=new Internacional(LocalDate.of(2025, 2, 1),"Argentina","Brasil",999,400,true);
		e3=new Internacional(LocalDate.of(2025, 2, 1),"Argentina","Brasil",1000,400,false);
		e4=new Internacional(LocalDate.of(2025, 2, 1),"Argentina","Brasil",1000,400,true);
		e5=new Internacional(LocalDate.of(2025, 2, 1),"Argentina","Brasil",1001,400,false);
		e6=new Internacional(LocalDate.of(2025, 2, 1),"Argentina","Brasil",1001,400,true);
	}
	
	@Test
	void testCalcularPrecio() {
		assertEquals(9990,e1.calcularPrecio());
		assertEquals(10790,e2.calcularPrecio());
		assertEquals(10000,e3.calcularPrecio());
		assertEquals(10800,e4.calcularPrecio());
		assertEquals(12012,e5.calcularPrecio());
		assertEquals(12812,e6.calcularPrecio());
	}
}
