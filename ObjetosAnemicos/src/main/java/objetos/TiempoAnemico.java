package objetos;

import java.time.LocalDate;

public class TiempoAnemico {

	private LocalDate fecha;

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TiempoAnemico() {
		fecha = LocalDate.now();
	}

}
