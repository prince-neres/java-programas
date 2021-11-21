public class Smartphone extends Computador{
	String tamanhoDeTela;
	String densidadePixels;
	String operadora;
	
	public Smartphone(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria, String tamanhoDeTela, String densidadePixels, String operadora){
		super(fabricante, memoriaPrincipal, memoriaSecundaria, processador);
		this.tamanhoDeTela = tamanhoDeTela;
		this.densidadePixels = densidadePixels;
		this.operadora = operadora;
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
	
	public void trocarOperadora(String operadora){
		this.operadora = operadora;
	}
	
	public void mostrar() {
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Armazenamento: " + this.memoriaPrincipal);
		System.out.println("Memória: " + this.memoriaSecundaria);
		System.out.println("Processador: " + this.processador);
		System.out.println("Tela: " + this.tamanhoDeTela);
		System.out.println("Densidade: " + this.densidadePixels);
		System.out.println("Operadora: " + this.operadora + "\n");
	}
}
