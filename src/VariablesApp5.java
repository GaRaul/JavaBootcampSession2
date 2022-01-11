
public class VariablesApp5 {

	public static void main(String[] args) {

//		Programa java que declare cuatro variables enteras A, B, C y D y
//		asígnale un valor a cada una. A continuación realiza las instrucciones
//		necesarias para que:
//		• B tome el valor de C
//		• C tome el valor de A
//		• A tome el valor de D
//		• D tome el valor de B

		int a = 0;
		int b = 5;
		int c = 10;
		int d = 15;
		
		System.out.println("Valores iniciales\n-----------------\nA = " + a +"\nB = " + b + "\nC = " + c + "\nD = " + d +
				"\n-----------------");
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("Nuevos valores\n-----------------\nA = " + a +"\nB = " + b + "\nC = " + c + "\nD = " + d);
		
	}

}
