public class pessoa {
	String nome;
	String cpf;
	String telefone;
	
	String gerarResumo() {
		String resumo = nome+"\n";
		resumo +="CPF: "+  cpf +"\n";
		resumo += "Telefone: "+ telefone +"\n";
		
		return resumo;
	}
}