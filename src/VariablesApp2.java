
public class VariablesApp2 {

	public static void main(String[] args) {
		// Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int,
		// una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
		
		int n = 5;
		double a = 4.56;
		char c = 'a';
		
		System.out.println("Variable N = " + n + "\nVariable A = " + a + "\nVariable C = " + c);
		
		double sumaNA = n + a;
		
		System.out.println("La suma de N + A = " + sumaNA);
		
		double restaAN = a - n;
		
		System.out.println("La diferencia de A - N = " + restaAN);
		
		int asciiC = 'a';
		
		System.out.println("Valor numerico del carácter " + c + " = " + asciiC);
	}

}
