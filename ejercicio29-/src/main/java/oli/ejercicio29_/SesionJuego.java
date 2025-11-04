package oli.ejercicio29_;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class SesionJuego extends Actividad{
	private int duracion;
	private List <Item>items;
	
	public SesionJuego (LocalDate fechaInicio, String IP, int duracion) {
		super(fechaInicio,IP);
		this.duracion=duracion;
		items = new ArrayList <Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularMonto() {
		if (this.duracion>360)
			return this.items.stream().mapToDouble(i->i.calcularPrecio()).sum();
		else
			return 0;
	}
}
