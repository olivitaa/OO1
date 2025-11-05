package ar.edu.unlp.info.oo1.ejercicio21;

public class Coorporativo extends Cliente {
	private String CUIT;
	
	public Coorporativo (String nombre, String direccion, String CUIT) {
		super(nombre,direccion);
		this.CUIT=CUIT;
	}
	
	public double calcularMonto(double precio) {
		return precio;
	}
}
