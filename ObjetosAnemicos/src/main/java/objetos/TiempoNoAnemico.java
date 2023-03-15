package objetos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {

	private LocalDate fecha;

	public TiempoNoAnemico() {
		fecha = LocalDate.now();
	}

	public void mostrarLargo() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE dd 'of' MMMM 'of' yyyy");
		System.out.println(fecha.format(df));
	}

	public void mostrarCorto() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(fecha.format(df));
	}

}
