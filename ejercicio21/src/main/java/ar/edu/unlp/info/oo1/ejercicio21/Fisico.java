package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Fisico extends Cliente {
	private int DNI;
	
	public Fisico(String nombre, String direccion, int DNI) {
		super(nombre,direccion);
		this.DNI=DNI;
	}
	
	public double calcularMonto(double monto) {
		return monto-(monto*0.1);
	}
}
