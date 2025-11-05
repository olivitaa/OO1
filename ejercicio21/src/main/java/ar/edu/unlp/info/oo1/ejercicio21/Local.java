package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Local extends Envio{
	private boolean entregaRapida;
	
	public Local(LocalDate fecha, String origen, String destino, double peso, double distancia, boolean rapida) {
		super(fecha,origen,destino,peso,distancia);
		this.entregaRapida=rapida;
	}
	
	public double calcularPrecio() {
		if (this.entregaRapida) {
			return 1500;
		}else {
			return 1000;
		}
	}
	
	
}
