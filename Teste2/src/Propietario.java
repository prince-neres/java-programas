import java.util.ArrayList;

public class Propietario {
	private String nome;
	ArrayList<Imovel> Imoveis = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimir() {
		System.out.println("Propietário: " + getNome() + "\n");
		for(Imovel imoveis : Imoveis) {
			 System.out.println(imoveis + "\n");
		}
	}
}


