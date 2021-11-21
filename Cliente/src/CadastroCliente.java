import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroCliente {
	
	List<String> clientes = new ArrayList<>();

	
	public void adicionarLista(String nome, String cpf){
		clientes.add("CPF: " + cpf + " Nome: " + nome + "\n");
	}
	
	public void ordenarLista() {
		Collections.sort(clientes);
	}
	
	public void imprimirLista(){
		System.out.println(clientes);
	}
}
