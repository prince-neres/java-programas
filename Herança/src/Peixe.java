public class Peixe extends Animal{
	private String tipoAlimentacao;
	
	public Peixe(String nome, String cor){	
		this.nome = nome;
		this.cor = cor;
	}
	
	public void setTipoAlimentacao(String tipoAlimentacao){
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}
	
	public void dadosPeixe(){
		System.out.println("Animal: " + nome);
		System.out.println("é " + cor);
		System.out.println("Seu tipo de alimentação é " + getTipoAlimentacao() + "\n");
	}

}

