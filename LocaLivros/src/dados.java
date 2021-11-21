public class dados {
	public static void main(String[] args) {
		
		pessoa p1 = new pessoa();
		livro l1 = new livro();
		emprestimo e1 = new emprestimo();
		
		p1.nome = "João";
		p1.cpf = "333.333.333-33";
		p1.telefone = "(61)98241-8924";
		
		l1.nome = "1984";
		l1.autor = "George Orwell";
		l1.ano = "1949";
		
		e1.data = "20/05/2021";
		e1.local = "Biblioteca de Brasília";
		e1.entregue = true;
		
		System.out.println(p1.gerarResumo());
		System.out.println(l1.gerarLivro());
		System.out.println(e1.gerarEmprestimo());
	}
}
