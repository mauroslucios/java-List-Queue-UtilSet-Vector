package one.digitalinnovation;

import java.util.Optional;

public class ExemploOptionalEstados {

	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Valor presente");
		
		System.out.println("Valor opcional que está presente");
		optionalString.ifPresentOrElse(System.out::println, ()-> System.out.print("não está presente"));
		
		Optional<String> optionalNull = Optional.ofNullable(null);
	}
	
	
}
