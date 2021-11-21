public class Calculadora {
		 
	float valor1, valor2, valor3;
	
	public Calculadora(float valor1) {
	
	}
	
	public Calculadora(float valor1, float valor2){
		
	}
	
	public Calculadora(float valor1, float valor2, float valor3){
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
 
	public void soma(){
		System.out.println("A soma dos números é: " + (valor1 + valor2 + valor3));
	}
	
	public void subtracao(){
		System.out.println("A subtração dos números é: " + (valor1 - valor2 - valor3));
	}
	
	public  void multiplicacao(){
		System.out.println("A multiplicação dos números é: " + (valor1 * valor2 * valor3));
	}
	
	public void divisao(){
		System.out.println("A divisão dos números é: " + (valor1 / valor2 / valor3));
	}
}
