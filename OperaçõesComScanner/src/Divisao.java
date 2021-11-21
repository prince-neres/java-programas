public class Divisao implements OperacaoMatematica{
	int n1;
	int n2;
	
	public Divisao(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void Calcula(){
		
		try {
				double n1 = this.n1;
				double n2 = this.n2;
			    
				System.out.println("O Resultado de " + this.n1 + " / " + this.n2 + " é: " + (n1/n2));
			} catch (java.lang.ArithmeticException e) {
				System.out.println("Erro: " + e + "O denominador não pode ser zero!");
			} 
	}
}
