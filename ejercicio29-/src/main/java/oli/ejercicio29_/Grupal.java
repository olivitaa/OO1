package oli.ejercicio29_;

public class Grupal extends Plan{
	private int cantMaxIPs;
	
	public Grupal (int cantMaxIPs) {
		this.cantMaxIPs=cantMaxIPs;
	}
	
	public double calcularPrecioBase() {
		return 800*this.cantMaxIPs;
	}
}
