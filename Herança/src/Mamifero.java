public class Mamifero extends Animal{
	private String tipoAlimentacao;
	
	public Mamifero(String nome, String cor, int qtdPatas){	
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
	}
	
	public void setTipoAlimentacao(String tipoAlimentacao){
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}
	
	public void dadosMamifero(){
		System.out.println("Animal: " + nome);
		System.out.println("? " + cor);
		System.out.println("Possui " + qtdPatas + " patas");
		System.out.println("Seu tipo de alimenta??o ? " + getTipoAlimentacao() + "\n");
	}

}
