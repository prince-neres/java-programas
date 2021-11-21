
public class Imovel {
	// Atributos
	double tamanho;
	int quantidadeQuartos;
	int quantidadeBanheiros;
	String localizacao;
	String tipo;
	Double preco;
	String posicao;
	
	Imovel(double tamanho, int qtdQuartos, int qtdBanheiros, String localizacao, String tipo,
			double preco, String posicao){
		if (tamanho > 0.0) {
			this.tamanho = tamanho;
		}else {
			System.err.println("Tamanho precisa ser positivo.");
			this.tamanho = 0.1;
		}
		
		if (qtdQuartos >= 0) {
			this.quantidadeQuartos = qtdQuartos;
		}else {
			System.err.println("Quantidade de quartos não pode ser negativa.");
			this.quantidadeQuartos = 0;
		}
		
		if (qtdBanheiros >= 0) {
			this.quantidadeBanheiros = qtdBanheiros;
		}else {
			System.err.println("Quantidade de banheiros não pode ser negativa.");
			this.quantidadeBanheiros = 0;
		}
		
		this.localizacao = localizacao;
		this.tipo = tipo;
		
		if (preco > 0.0) {
			this.preco = preco;
		}else {
			System.err.println("Preço precisa ser positivo.");
			this.preco = 0.1;
		}
		
		this.posicao = posicao;
	}
	
	// Métodos
	String gerarResumo() {
		String resumo = "" + this.tipo + " "+ this.posicao+", "+ this.tamanho+"m \n";
		resumo += this.quantidadeQuartos+ " quartos e "+ this.quantidadeBanheiros+ " banheiros\n";
		resumo += "Localização "+ this.localizacao+"\n";
		resumo += "R$ " + this.preco+"\n";
		return resumo;
	}

}
