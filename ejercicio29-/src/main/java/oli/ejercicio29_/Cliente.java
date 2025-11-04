package oli.ejercicio29_;

import java.time.LocalDate;
import ejercicio16.ejercicio16.DateLapse;

public class Cliente {
	private String nombre;
	private LocalDate fechaAlta;
	private Plan plan;
	
	public Cliente(String nombre, LocalDate fechaAlta, Plan plan) {
		this.fechaAlta=fechaAlta;
		this.nombre=nombre;
		this.plan=plan;
	}
	
	public double montoTotalACobrar(DateLapse periodo) {
		return plan.calcularPenalizacion()+ plan.calcularPrecioBase();
	}
	
	public double calcularMontoPorActividades(LocalDate fechaInicio, LocalDate fechaFin) {
		return this.plan.getMontoActividades(fechaInicio,fechaFin);
	}
}
