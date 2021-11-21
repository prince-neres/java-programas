public class NotaFiscalMain {

	public static void main(String[] args) {
		PagamentoEmDinheiro  pd1 = new PagamentoEmDinheiro(100, 50);	
		NotaFiscal nf1 = new NotaFiscal("119835", pd1);
		nf1.ImprimirNota();
		
		PagamentoEmCartao pc1 = new PagamentoEmCartao(100, "Elo", "258745");
		NotaFiscal nf2 = new NotaFiscal("2345234", pc1);
		nf2.ImprimirNota();

	}
}
