package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public abstract class Cliente {
	private String nombre, direccion;
	private List <Envio> envios;
	
	public Cliente (String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.envios = new ArrayList <Envio>();
	}
	
	public double montoAPagar(DateLapse periodo) {
		return this.envios.stream().filter(fecha-> periodo.includesDate(fecha.getFechaDespacho())).mapToDouble(monto->this.calcularMonto(monto.calcularPrecio())).sum();
	}
	
	public abstract double calcularMonto(double monto);

	public void agregarEnvio(Envio unEnvio) {
		this.envios.add(unEnvio);
	}
	
	public int getSize() {
		return this.envios.size();
	}
}
