import java.util.ArrayList;

public class Filme extends ProdutoAudiovisual{
	private ArrayList<String> atores = new ArrayList<>();
	boolean ganhouOscar;
	int duracao;
	
	public Filme(String titulo, int ano, String diretor, boolean ganhouOscar, int duracao) {
		super(titulo, ano, diretor);
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.ganhouOscar = ganhouOscar;
		this.duracao = duracao;
	}
	
	ArrayList<String> getAtores(){
		   return this.atores;
	}
	
	public void alterarTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void alterarAno(int ano) {
		this.ano = ano;
	}
	
	public void alterarDiretor(String diretor){
		this.diretor = diretor;
	}
	
	public void adicionarAtor(String nome){
		atores.add(nome);
	}
	
	public void removerAtor(String nome){
		atores.remove(nome);
	}
	
	public void ganhouOscar(boolean ganhou){
		this.ganhouOscar = ganhou;
	}
	
	public void alterarDuracao(int minutos){
		this.duracao = minutos;
	}
		
	public void info(){
		System.out.println("Filme: " + this.titulo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Diretor: " + this.diretor);
			if(this.ganhouOscar = true) {
				System.out.println("Oscar?: Sim, tem.");
			} else {
				System.out.println("Oscar?: Não tem!");
			}
		System.out.println("Duracão: " + this.duracao + " minutos");
		System.out.println("Atores: " + atores + "\n");
	}
}

