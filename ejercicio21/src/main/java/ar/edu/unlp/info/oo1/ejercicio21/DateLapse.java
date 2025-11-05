package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date{
	private LocalDate from,to;
	
	public DateLapse (LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return to;
	}

	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from,to);
	}
	
	public boolean includesDate(LocalDate other) {
		return ((other.equals(from))||(other.equals(to))||((other.isAfter(from))&& (other.isBefore(to))));
	}
	
	public boolean overlaps (DateLapse periodo) {
		return !((this.from.isAfter(periodo.to)) || (this.to.isBefore(periodo.from)));
	}

}
