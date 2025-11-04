package oli.ejercicio29_;

public class Item {
	private String nombre;
	private int cantidad;
	private double precioU;
	
	public Item(String nombre, int cantidad, double precioU) {
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.precioU=precioU;
	}
	
	public double calcularPrecio() {
		return this.precioU*this.cantidad;
	}
}
