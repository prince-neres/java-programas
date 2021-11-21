public class ClienteMain {
	public static void main(String[] args) {
		
		Cliente cliente0 = new Cliente("João", "523.235.234.65");
		Cliente cliente1 = new Cliente("Pedro", "124.235.234.65");
		Cliente cliente2 = new Cliente("Marcos", "567.235.234.65");
		Cliente cliente3 = new Cliente("Vitor", "708.235.234.65");
		Cliente cliente4 = new Cliente("Adão", "557.235.234.65");
		Cliente cliente5 = new Cliente("Paulo", "577.235.234.65");
		Cliente cliente6 = new Cliente("Gabriel", "677.235.234.65");
		Cliente cliente7 = new Cliente("Luis", "867.235.234.65");
		Cliente cliente8 = new Cliente("Guilherme", "597.235.234.65");
		Cliente cliente9 = new Cliente("Davi", "517.235.234.65");
		
		CadastroCliente CD = new CadastroCliente();
		
		CD.adicionarLista(cliente0.getNome(), cliente0.getCpf());
		CD.adicionarLista(cliente1.getNome(), cliente1.getCpf());
		CD.adicionarLista(cliente2.getNome(), cliente2.getCpf());
		CD.adicionarLista(cliente3.getNome(), cliente3.getCpf());
		CD.adicionarLista(cliente4.getNome(), cliente4.getCpf());
		CD.adicionarLista(cliente5.getNome(), cliente5.getCpf());
		CD.adicionarLista(cliente6.getNome(), cliente6.getCpf());
		CD.adicionarLista(cliente7.getNome(), cliente7.getCpf());
		CD.adicionarLista(cliente8.getNome(), cliente8.getCpf());
		CD.adicionarLista(cliente9.getNome(), cliente9.getCpf());
		
		CD.ordenarLista();
		CD.imprimirLista();		
	}
}
