import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoMain{
	public static void main(String[] args){
        List<Aluno> Alunos = new ArrayList<Aluno>();
        
        Aluno a1 = new Aluno();
        a1.setNome("Marcos");
        a1.setMatricula(2345246);
        a1.setCurso("TI");
        Alunos.add(a1);
        
        Aluno a2 = new Aluno();
        a2.setNome("Vitor");
        a2.setMatricula(134154);
        a2.setCurso("TI");
        Alunos.add(a2);
        
        Aluno a3 = new Aluno();
        a3.setNome("Maria");
        a3.setMatricula(23454);
        a3.setCurso("Filosofia");
        Alunos.add(a3);
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma matrícula: ");
		long mat = sc.nextLong();
		
		for(int i = 0; i < Alunos.size(); i++) {	
//			if(Alunos.get(i).getMatricula() == mat){
//				System.out.println("Encontrado:");
//				System.out.println(Alunos.get(i));
//			} else {
//				System.out.println("Não encontrado...");
//			}
			switch (Alunos.get(i)) {
			  case valor1:
				  Alunos.get(i).getMatricula() == mat;
			    break;
			  default:
			    código se variável diferente de 
		}
	}
}

