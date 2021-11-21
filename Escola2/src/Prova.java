public class Prova extends Avaliacao{
	double tempoDuracao;
	int quantidadeQuestoes;
	boolean consultaAutorizada;
	
	public Prova(String nome, double nota, double tempo, int qtdQuestoes, boolean consulta){
		super(nome, nota);
		
		this.nome = nome;
		this.nota = nota;
		this.tempoDuracao = tempo;
		this.quantidadeQuestoes = qtdQuestoes;
		this.consultaAutorizada = consulta;
		
		if(nota <= 0){
			this.nota = 10;		
		}
	}
	
	public String getInfo(){
		String resumo = "Nome: " + this.nome + "\n" + "\n";
			   resumo += "Prova Normal" + "\n";
			   resumo += "Nota: " + this.nota + "\n";
			   resumo += "Tempo de Prova: " + Math.round(tempoDuracao) + " minutos" + "\n";
			   resumo += "Número de Questões: " + quantidadeQuestoes + "\n";
			   resumo += "Houve Consulta? " + consultaAutorizada + "\n" + "\n"; 
		
		return resumo;
	}
}
