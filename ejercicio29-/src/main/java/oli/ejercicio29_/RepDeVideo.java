package oli.ejercicio29_;

import java.time.LocalDate;

public class RepDeVideo extends Actividad{
	private int duracionTotal,duracionPublicidad;
	
	public RepDeVideo (LocalDate fechaInicio, String IP, int duracionTotal, int duracionPublicidad) {
		super(fechaInicio,IP);
		this.duracionPublicidad=duracionPublicidad;
		this.duracionTotal=duracionTotal;
	}
	
	public int getDuracionReal() {
		return this.duracionTotal-this.duracionPublicidad;
	}
	
	public double calcularMonto() {
		return this.getDuracionReal()*10;
	}
}
