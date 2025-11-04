package oli.ejercicio29_;

public class Individual extends Plan {
	private int minutosContratados;
	
	public Individual (int minutos) {
		this.minutosContratados=minutos;
	}
	
	public double calcularPrecioBase () {
		return 20*this.minutosContratados;
	}

	@Override
	public double calcularPenalizacion() {
		// TODO Auto-generated method stub
		return 0;
	}
}
