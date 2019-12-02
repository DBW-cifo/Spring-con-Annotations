package with.annotations;

public class Invertir implements ICodificar {

	@Override
	public String codificar(String cadena) {
		return new StringBuilder(cadena).reverse().toString();
	}

	@Override
	public String decodificar(String cadena) {
		return codificar(cadena);
	}
}