public class Adicao implements OperacaoMatematica{
	int n1;
	int n2;
	
	public Adicao(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void Calcula(){
		System.out.println("O Resultado de " + this.n1 + " + " + this.n2 + " é: " + (this.n1+this.n2));
	}

}
