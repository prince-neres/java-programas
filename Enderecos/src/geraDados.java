public class geraDados {

	public static void main(String[] args) {
		CadernoDeEnderecos c1 = new CadernoDeEnderecos();
		c1.nome = "Jo?o";
		c1.telefone = "(61)98323-3324";
		c1.email = "joao31@yahoo.com";
		c1.endereco = "Asa-norte, Rua 12, N?345.";
		c1.cheio = false;
		
		c1.escreveDados();
	}
}
