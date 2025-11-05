package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Interurbano extends Envio {

	public Interurbano(LocalDate fecha, String origen, String destino, double peso, double distancia) {
		super(fecha,origen,destino,peso,distancia);
	}
	
	public double calcularPrecio() {
		double peso=this.getPeso();
		if (this.getDistancia()<100) {
			return peso*20;
		}else if ((this.getDistancia()>=100)&&(this.getDistancia()<=500)){
			return peso*25;
		}else {
			return peso*30;
		}
	}
	
}
