public abstract class Computador {
	String fabricante;
	String processador;
	String memoriaPrincipal;
	String memoriaSecundaria;
	
	public Computador(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria) {
		
	}

	public abstract void Processador(String processador);
	
	public abstract void memoriaPrincipal(String memoriaPrincipal);
	
	public abstract void memoriaSecundaria(String memoriaSecundaria);
}
