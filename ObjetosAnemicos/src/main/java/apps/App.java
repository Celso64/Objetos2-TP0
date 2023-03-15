package apps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import objetos.TiempoAnemico;
import objetos.TiempoNoAnemico;
import objetos.TiempoRecord;

public class App {

	public static void main(String[] args) {

		TiempoAnemico t = new TiempoAnemico();
		System.out.println("Tiempo - Objeto Anemico\n");
		DateTimeFormatter dateFormatLarge = DateTimeFormatter.ofPattern("EEEE dd 'of' MMMM 'of' yyyy");
		System.out.println(t.getFecha().format(dateFormatLarge));
		DateTimeFormatter dateFormatShort = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(t.getFecha().format(dateFormatShort));

		System.out.println("\n**************************************");
		System.out.println("Tiempo - Objeto No Anemico\n");
		TiempoNoAnemico tn = new TiempoNoAnemico();
		tn.mostrarLargo();
		tn.mostrarCorto();

		System.out.println("\n**************************************");
		System.out.println("Tiempo - Record\n");
		TiempoRecord tr = new TiempoRecord(LocalDate.now());
		System.out.println(tr.fecha().format(dateFormatLarge));
		System.out.println(tr.fecha().format(dateFormatShort));

	}

}
