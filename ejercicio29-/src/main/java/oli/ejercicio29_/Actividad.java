package oli.ejercicio29_;

import java.time.LocalDate;

public abstract class Actividad {
	private LocalDate fechaInicio;
	private String IP;
	
	public Actividad (LocalDate fechaInicio, String IP) {
		this.fechaInicio=fechaInicio;
		this.IP = IP;
	}
	
	public abstract double calcularMonto();
	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
}
