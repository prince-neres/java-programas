public class CadernoDeEnderecos {
	//Atributos
	String nome;
	String telefone;
	String email;
	String endereco;
	boolean cheio;
	
	//Metodos
	void escreveDados() {
		if(this.cheio == true) {
			System.out.print("Caderno cheio!");
		} else {
			apresentaDados();
		}
	}
	
	void apresentaDados(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("E-mail: "+ this.email);
		System.out.println("Endere�o: " + this.endereco);
	}
}
