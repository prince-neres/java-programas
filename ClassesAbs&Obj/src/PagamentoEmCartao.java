public class PagamentoEmCartao extends Pagamento{
	String bandeira;
	String numeroDeTransa��o;
	
	public PagamentoEmCartao(double valor, String bandeira, String numeroDeTransacao){
		this.valor = valor;
		this.bandeira = bandeira;
		this.numeroDeTransa��o = numeroDeTransacao;
		
	}
	
	public String imprimir() {
		String resumo = "Cart�o" + "\n";
	    resumo += "Valor Total: R$" + Math.round(valor) + " Reais" + "\n";
		resumo += "Bandeira do Cart�o: " + bandeira + "\n";
		resumo += "N�mero de Transa��o: " + numeroDeTransa��o + "\n";
		return resumo;
	}
}
