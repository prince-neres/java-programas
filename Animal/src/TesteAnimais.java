import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAnimais {
	public static void main(String[] args) {
		
		List<String> Animais = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("DIGITE 1 PARA CADASTRAR E 0 PARA SAIR");
        int resp = s.nextInt();

        while (resp != 0) {
        	System.out.println("Escolha um animal para cadastrar: ");
    		System.out.println("1 - CACHORRO " + "\n" + "2 - CAVALO " + "\n" + "3 - PREGUICA ");
        	int op = s.nextInt();
        	if(op == 1) {
        		Cachorro animal = new Cachorro();
        		System.out.println("Digite o nome do animal: ");
                String nome = s.next();
                animal.setNome(nome);
                System.out.println("Digite a idade do animal: ");
                String idade = s.next();
                animal.setIdade(idade);
                Animais.add("\n" + "Nome: " + animal.getNome() + "\n" + "Idade: " + animal.getIdade() + "\n" + "Som emitido: " + animal.emitirSom() + "\n");
        	} if (op == 2 ) {
        		Cavalo animal = new Cavalo();
        		System.out.println("Digite o nome do animal: ");
                String nome = s.next();
                animal.setNome(nome);
                System.out.println("Digite a idade do animal: ");
                String idade = s.next();
                animal.setIdade(idade);
                Animais.add("\n" + "Nome: " + animal.getNome() + "\n" + "Idade: " + animal.getIdade() + "\n" + "Som emitido: " + animal.emitirSom() + "\n");
        	} if (op == 3) {
        		Preguica animal = new Preguica();
        		System.out.println("Digite o nome do animal: ");
                String nome = s.next();
                animal.setNome(nome);
                System.out.println("Digite a idade do animal: ");
                String idade = s.next();
                animal.setIdade(idade);
                Animais.add("\n" + "Nome: " + animal.getNome() + "\n" + "Idade: " + animal.getIdade() + "\n" + "Som emitido: " + animal.emitirSom() + "\n");
        	}   
            System.out.println(Animais);	
            System.out.println("DIGITE 1 PARA CADASTRAR E 0 PARA SAIR: ");
            resp = s.nextInt();
        }

	}
}
