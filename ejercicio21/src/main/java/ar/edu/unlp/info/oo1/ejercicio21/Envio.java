package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String origen,destino;
	private double peso,distancia;
	
	public Envio(LocalDate fechaDespacho, String origen, String destino, double peso, double distancia) {
		this.fechaDespacho=fechaDespacho;
		this.origen=origen;
		this.destino=destino;
		this.peso=peso;
		this.distancia=distancia;
	}
	
	public abstract double calcularPrecio();
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getDistancia() {
		return this.distancia;
	}
	
	public LocalDate getFechaDespacho() {
		return this.fechaDespacho;
	}
	
}
