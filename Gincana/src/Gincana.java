public class Gincana {
	public int pontosAzuis;
	public int pontosVerdes;
	public int pontosVermelhos;
	
	public Gincana(int azul, int verde, int vermelho){
		this.pontosAzuis = azul;
		this.pontosVerdes = verde;
		this.pontosVermelhos = vermelho;
	}
	
	public void adicionaAzul(int qtde){
		this.pontosAzuis += qtde;
	}
	
	public void removeAzul(int qtde){
		this.pontosAzuis -= qtde;
	}
	
	public void adicionaVerde(int qtde){
		this.pontosVerdes += qtde;
	}
	
	public void removeVerde(int qtde){
		this.pontosVerdes -= qtde;
	}
	
	public void adicionaVermerlho(int qtde){
		this.pontosVermelhos += qtde;
	}
	
	public void removeVermelho(int qtde){
		this.pontosVermelhos -= qtde;
	}
	
	public void placar(){
		String primeiro;
		String segundo;
		String terceiro;
		
		if(pontosAzuis > pontosVerdes && pontosVerdes > pontosVermelhos){
			primeiro = "Equipe Azul";
			segundo = "Equipe Verde";
			terceiro = "Equipe Vermelha";
		} else if (pontosVerdes > pontosAzuis && pontosAzuis > pontosVermelhos){
			primeiro = "Equipe Verde";
			segundo = "Equipe Azul";
			terceiro = "Equipe Vermelha";
		} else if (pontosVermelhos > pontosAzuis && pontosAzuis > pontosVerdes){
			primeiro = "Equipe Vermelha";
			segundo = "Equipe Azul";
			terceiro = "Equipe Verde";
		} else if (pontosVermelhos > pontosVerdes && pontosVerdes > pontosAzuis){
			primeiro = "Equipe Vermelha";
			segundo = "Equipe Verde";
			terceiro = "Equipe Azul";
		} else if (pontosAzuis > pontosVerdes && pontosVermelhos > pontosVerdes){
			primeiro = "Equipe Azul";
			segundo = "Equipe Vermelha";
			terceiro = "Equipe Verde";
		} else {
			primeiro = "Equipe Verde";
			segundo = "Equipe Vermelha";
			terceiro = "Equipe Azul";
		}
		
		System.out.println("********RESULTADOS********");
		System.out.println("1° " + primeiro);
		System.out.println("2° " + segundo);
		System.out.println("3° " + terceiro);
	}
}
