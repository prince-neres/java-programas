public class NotaFiscal {
	String codigo;
	Pagamento pagamento;
	
	public NotaFiscal(String codigo, Pagamento pagamento){
		this.codigo = codigo;
		this.pagamento = pagamento;
	}
	
	public void ImprimirNota(){
		System.out.println("Código: " + codigo);
		System.out.println("Pagamento: " + pagamento.imprimir());
	}
}
