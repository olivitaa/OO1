package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Internacional extends Envio {
	private boolean entregaRapida;
	
	public Internacional(LocalDate fecha, String origen, String destino, double peso, double distancia, boolean rapida) {
		super(fecha,origen,destino,peso,distancia);
		this.entregaRapida=rapida;
	}
	
	public double calcularPrecio() {
		double adicional =0;
		if (this.entregaRapida) {
			adicional= 800;
		}
		if (this.getPeso()<=1000) {
			return (this.getPeso()*10)+ adicional;
		}else {
			return (this.getPeso()*12)+adicional;
		}
	}

}
