package with.annotations;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Codificador {
	private IProcesar _procesar;
	private ICodificar _codificador;
	
	public Codificador(IProcesar procesar, ICodificar codificador) {
		_procesar=procesar;
		_codificador=codificador;
	}
	
	public String codificar(String cadena) {
		ArrayList<String> piezas;
		piezas=_procesar.dividir(cadena);
		piezas=(ArrayList<String>)piezas.stream().map(el->_codificador.codificar(el)).collect(Collectors.toList());
		return _procesar.unir(piezas);
	}
	public String decodificar(String cadena) {
		ArrayList<String> piezas;
		piezas=_procesar.dividir(cadena);
		piezas=(ArrayList<String>)piezas.stream().map(el->_codificador.decodificar(el)).collect(Collectors.toList());
		return _procesar.unir(piezas);
	}
}