import java.util.ArrayList;

public class Serie extends ProdutoAudiovisual{
	private ArrayList<String> atores = new ArrayList<>();
	int temporadas;
	
	
	public Serie(String titulo, int ano, String diretor, int temporadas) {
		super(titulo, ano, diretor);
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.temporadas = temporadas;
	}
	
	ArrayList<String> getAtores() {
		   return this.atores;
	}
	
	public void alterarTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void alterarAno(int ano) {
		this.ano = ano;
	}

	public void alterarDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public void adicionarAtor(String nome){
		atores.add(nome);
	}
	
	public void removerAtor(String nome){
		atores.remove(nome);
	}
	
	public void alterarNumTemporadas(int temporadas){
		this.temporadas = temporadas;
	}
	
	public void info(){
		System.out.println("Série: " + this.titulo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Diretor: " + this.diretor);
		System.out.println("Temporadas: " + this.temporadas);
		System.out.println("Atores: " + atores + "\n");
	}
}
