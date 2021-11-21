
public class Anunciante {
	// Atributo
	String nome;
	String telefone;
	String email;
	boolean propietario;
	
	// Método
	String gerarResumo() {
		String resumo = nome+"\n";
		resumo +="Telefone: "+  telefone +"\n";
		resumo += "e-mail: "+ email +"\n";
		resumo += ( propietario ? "Direto com o Propietario" : "");
		
		return resumo;
	}

}
