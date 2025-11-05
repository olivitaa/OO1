package ar.edu.unlp.info.oo1.ejercicio21;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterurbanoTest {
	private Interurbano e1,e2,e3,e4,e5;
	
	@BeforeEach
	void setUp() {
		e1= new Interurbano(LocalDate.of(2025, 2, 1),"LP","Bera",3000,99);
		e2= new Interurbano(LocalDate.of(2025, 2, 1),"LP","Bera",3000,100);
		e3= new Interurbano(LocalDate.of(2025, 2, 1),"LP","Bera",3000,300);
		e4= new Interurbano(LocalDate.of(2025, 2, 1),"LP","Bera",3000,500);
		e5= new Interurbano(LocalDate.of(2025, 2, 1),"LP","Bera",3000,501);
	}
	
	@Test
	void testCalcularPrecio() {
		assertEquals(60000,e1.calcularPrecio());
		assertEquals(75000,e2.calcularPrecio());
		assertEquals(75000,e3.calcularPrecio());
		assertEquals(75000,e4.calcularPrecio());
		assertEquals(90000,e5.calcularPrecio());
	}
	
}
