public class Documentario extends ProdutoAudiovisual{
	boolean ganhouOscar;
	int duracao;
	
	public Documentario(String titulo, int ano, String diretor, boolean ganhouOscar, int duracao) {
		super(titulo, ano, diretor);
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.ganhouOscar = ganhouOscar;
		this.duracao = duracao;
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
	
	public void ganhouOscar(boolean ganhou){
		this.ganhouOscar = ganhou;
	}
	
	public void alterarDuracao(int minutos){
		this.duracao = minutos;
	}
	
	public void info(){
		System.out.println("Documentário: " + this.titulo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Diretor: " + this.diretor);
			if(this.ganhouOscar = true) {
				System.out.println("Oscar?: Sim, tem.");
			} else {
				System.out.println("Oscar?: Não tem!");
			}
		System.out.println("Duracão: " + this.duracao + " minutos" + "\n");
	}
}
