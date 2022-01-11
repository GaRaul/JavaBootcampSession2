
public class VariablesApp3 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		double n = 3.4;
		double m = 7.7;
		
		System.out.println("X = " + x + " | Y = " + y + " | N = " + n + " | M = " + m);
		System.out.println("X + Y = " + (x+y) + "\nX - Y = " + (x-y) + "\nX * Y = " + (x*y) + 
				"\nX / Y = " + (x/y) + "\nX % Y = " + (x%y));
		System.out.println("-----------");
		System.out.println("N + M = " + (n+m) + "\nN - M = " + (n-m) + "\nN * M = " + (n*m) + 
				"\nN / M = " + (n/m) + "\nN % M = " + (n%m));
		System.out.println("-----------");
		System.out.println("X * 2 = " + x*2 + "\nY * 2 = " + y*2 + "\nN * 2 = " + n*2 + "\nM * 2 = " + m*2);
		
		double sumaTotal = x+y+n+m;
		double prodTotal = x*y*n*m;
		
		System.out.println("Suma de todas las variables = " + sumaTotal + "\nProducto de todas las variables = " + prodTotal);
		
	}

}
