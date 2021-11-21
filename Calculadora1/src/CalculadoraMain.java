public class CalculadoraMain {
	public static void main(String[] args) {
		System.out.println("SOMA");
		Calculadora.soma2(10, 12);
		Calculadora.soma3(23, 23, 24);
		System.out.println("\n");
		System.out.println("SUBTRAÇÂO");
		Calculadora.subtrai2(10, 5);
		Calculadora.subtrai3(10, 5, 21);
		System.out.println("\n");
		System.out.println("MULTIPLICAÇÂO");
		Calculadora.multiplica2(10, 5);
		Calculadora.multiplica3(10, 5, 21);
		System.out.println("\n");
		System.out.println("DIVISÂO");
		Calculadora.divide2(10, 5);
		Calculadora.divide3(20, 5, 2);

	}
}
