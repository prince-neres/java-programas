public class ComputadorDeMesa extends Computador{
	String fabricanteGabinete;
	String tipoGabinete;
	String fonte;
	
	public ComputadorDeMesa(String fabricante, String memoriaPrincipal, String memoriaSecundaria, String processador, String fabricanteGabinete, String tipoGabinete, String fonte){
		super(fabricante, memoriaPrincipal, memoriaSecundaria, processador);
		this.fabricanteGabinete = fabricanteGabinete;
		this.tipoGabinete = tipoGabinete;
		this.fonte = fonte;
		this.fabricante = fabricante;
		this.processador = processador;
		this.memoriaPrincipal = memoriaPrincipal;
		this.memoriaSecundaria = memoriaSecundaria;
	}

	public void Processador(String processador){
		this.processador = processador;
	}

	public void memoriaPrincipal(String memoriaPrincipal){
		this.memoriaPrincipal = memoriaPrincipal;
	}

	public void memoriaSecundaria(String memoriaSecundaria) {
		this.memoriaSecundaria = memoriaSecundaria;
	}
	
	public void trocarFabricanteGabinete(String fabricanteGabinete) {
		this.fabricanteGabinete = fabricanteGabinete;
	}
	
	public void trocarTipogabinete(String tipoGabinete) {
		this.tipoGabinete = tipoGabinete;
	}
	
	public void trocarFonte(String fonte) {
		this.fonte = fonte;
	}
	
	public void mostrar() {
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Armazenamento: " + this.memoriaPrincipal);
		System.out.println("Memória: " + this.memoriaSecundaria);
		System.out.println("Processador: " + this.processador);
		System.out.println("Fabricante do Gabinete: " + this.fabricanteGabinete);
		System.out.println("Gabinete: " + this.tipoGabinete);
		System.out.println("Fonte: " + this.fonte + "\n");
	}
}
