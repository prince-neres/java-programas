import java.util.HashMap;
import java.util.Map;

public class Atividade3 {
	public static void main(String[] args) {
		Map<String,String> ListaDePessoas = new HashMap<String, String>();
		ListaDePessoas.put("17802387423", "João");
		ListaDePessoas.put("12343455677", "Maria");
		ListaDePessoas.put("15234256576", "Claudinei");
		
		System.out.println("Lista de CPFs: ");
		for(String CPF : ListaDePessoas.keySet()) {
			String Pessoa = ListaDePessoas.get(CPF);
			System.out.println("CPF: " + CPF + " - " + "Dono: " + Pessoa);
		}
		
		System.out.println("\n" + "Lista de Matriculas: ");
		
		Map<String,String> ListaDeAlunos = new HashMap<String, String>();
		ListaDeAlunos.put("12342534", "Luis");
		ListaDeAlunos.put("13223455", "Pedro");
		ListaDeAlunos.put("19832354", "Vitor");

		for(String matricula : ListaDeAlunos.keySet()) {
			String aluno = ListaDeAlunos.get(matricula);
			System.out.println("Matrícula: " + matricula + " - " + "Aluno: " + aluno);
		}
	}
}
