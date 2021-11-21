public class Prova extends Avaliacao{
	double tempoDuracao;
	int quantidadeQuestoes;
	boolean consultaAutorizada;
	
	public Prova(String nome, double nota, double tempo, int qtdQuestoes, boolean consulta){
		this.nome = nome;
		this.nota = nota;
		this.tempoDuracao = tempo;
		this.quantidadeQuestoes = qtdQuestoes;
		this.consultaAutorizada = consulta;
	}
	
	public String getInfo(){
		String resumo = "Nome: " + nome + "\n" + "\n";
			   resumo += "Prova Normal" + "\n";
			   resumo += "Nota: " + nota + "\n";
			   resumo += "Tempo de Prova: " + Math.round(tempoDuracao) + " minutos" + "\n";
			   resumo += "Número de Questões: " + quantidadeQuestoes + "\n";
			   resumo += "Houve Consulta? " + consultaAutorizada + "\n" + "\n"; 
		
		return resumo;
	}
}
