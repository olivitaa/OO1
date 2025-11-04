package oli.ejercicio29_;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Plan {
	private int cantMaxIPs,cantIPs;
	private double precioBase;
	private List <Actividad> actividades;
	
	public Plan () {
		this.cantIPs = 0;
		actividades = new ArrayList<Actividad>();
	}
	
	public void agregarActividad(Actividad act) {
		this.actividades.add(act);
	}
	
	public abstract double calcularPrecioBase();
	public abstract double calcularPenalizacion();
	public double getMontoActividades(LocalDate fechaInicio, LocalDate fechaFin) {
		return this.actividades.stream().filter(a->a.getFechaInicio()).mapToDouble(a->a.calcularMonto()).sum();
	}
}
