public class PagamentoEmDinheiro extends Pagamento {
	double valorRecebido;
	double troco;
	
	public PagamentoEmDinheiro(double valor, double valorRecebido){
		this.valor = valor;
		this.valorRecebido = valorRecebido;
	}
	
	public String imprimir() {
		troco = valorRecebido - valor;
		String resumo = "Dinheiro" + "\n";
		resumo += "Valor Total: R$" + Math.round(valor) + " Reais" +  "\n";
		resumo += "Valor Recebido: R$" + Math.round(valorRecebido) + " Reais" + "\n";
		if(troco<0) {
			resumo += "Ainda faltam R$" + Math.abs(troco) + " Reais!" + "\n"; 
		} else if (troco == 0){
			resumo += "Sem troco." + "\n";
		} else {
		resumo += "Troco: R$" + troco + " Reais" + "\n";
		}
		
		return resumo;
	}
}
