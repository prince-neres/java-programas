import java.util.Scanner;

public class OperacaoMatematicaMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		try {
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = s.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int n2 = s.nextInt();
		
		System.out.println("1. Adi��o");
		System.out.println("2. Subtra��o");
		System.out.println("3. Multiplica��o");
		System.out.println("4. Divis�o");
		System.out.println("Escolha uma op��o: ");
		int opcao = s.nextInt();
		
			if(opcao == 1) {
				Adicao adicao = new Adicao(n1, n2);
				adicao.Calcula();			
			} else if(opcao == 2){
				Subtracao subtracao = new Subtracao(n1, n2);
				subtracao.Calcula();
			} else if(opcao == 3){
				Multiplicacao multiplicacao = new Multiplicacao(n1, n2);
				multiplicacao.Calcula();
			} else if(opcao == 4){
				Divisao divisao = new Divisao(n1, n2);
				divisao.Calcula();
			}
		} catch (java.util.InputMismatchException e){
			System.out.println("Erro: " + e + " Os algarismos devem ser inteiros!");
		} 
	}
}
