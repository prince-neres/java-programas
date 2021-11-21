public class ContadorDePessoas {
	int limitePessoas;
	int qtdePresente;
	int qtdeTotal;
	
	ContadorDePessoas (int limite){
		this.limitePessoas = limite;
	}
	
	  Object registraEntrada (int quantidade){
		
		if( qtdeTotal < this.limitePessoas) {
			qtdeTotal += quantidade;
			System.out.println("Aquantidade total é " + qtdeTotal + "\nO limite é de " + this.limitePessoas + " pessoas.");
			return qtdeTotal;
		}
		else {
			System.out.println("Capacidade máxima atingida.");
			return qtdeTotal;
		}
		
	 }
	
	 	Object registraSaida (int quantidade) {
	 	qtdeTotal += this.qtdeTotal;
		int diferenca = 0;
		
		diferenca = qtdeTotal - quantidade;
		System.out.println("Sairam do estabelecimento " + quantidade + ".\nCapacidade atual é de " + diferenca + " pessoas." + qtdeTotal);
		
		return qtdeTotal;
	}
}
