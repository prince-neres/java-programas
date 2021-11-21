public class Apartamento extends Imovel{
	boolean garagem;
	boolean elevador;
	
	public String toString(){
	    return "Apartamento" + "\n" + 
		"Tamanho: " + getTamanho() + " m2" + "\n" + 
		"Local: " + getLocal() + "\n" +
		"Garagem: " + garagem + "\n" + 
		"Elevador: " + elevador;
	    
	}
}
