public class PagamentoEmCartao extends Pagamento{
	String bandeira;
	String numeroDeTransação;
	
	public PagamentoEmCartao(double valor, String bandeira, String numeroDeTransacao){
		this.valor = valor;
		this.bandeira = bandeira;
		this.numeroDeTransação = numeroDeTransacao;
		
	}
	
	public String imprimir() {
		String resumo = "Cartão" + "\n";
	    resumo += "Valor Total: R$" + Math.round(valor) + " Reais" + "\n";
		resumo += "Bandeira do Cartão: " + bandeira + "\n";
		resumo += "Número de Transação: " + numeroDeTransação + "\n";
		return resumo;
	}
}
