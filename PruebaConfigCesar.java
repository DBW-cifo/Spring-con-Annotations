package with.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("with.annotations")
public class PruebaConfigCesar {

	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar cesar() {
		return new Cesar();
	}
	
	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(),cesar());
	}
}