package modelo;

import java.util.List;

public class Viedma implements Tarjeta {

	@Override
	public Double pagarCuenta(Cuenta cuenta, Integer propina) {
		List<Producto> lista = cuenta.getValores();
		Double precio = 0.0;
		for (Producto p : lista) {
			precio += p.valor();
		}
		precio *= (1 + propina / 100.0);
		return precio;
	}

}
