public class AnimalMain {

	public static void main(String[] args) {
		Mamifero Leao = new Mamifero("Le�o", "Parda", 4);
		Leao.setTipoAlimentacao("Carn�voro");
		Leao.dadosMamifero(); 
		
		Mamifero Cavalo = new Mamifero("Cavalo", "Marrom", 4);
		Cavalo.setTipoAlimentacao("Herb�voro");
		Cavalo.dadosMamifero(); 
		
		Mamifero Camelo = new Mamifero("Camelo", "Amarelo", 4);
		Camelo.setTipoAlimentacao("Herb�voro");
		Camelo.dadosMamifero(); 
		
		Peixe Peixe1 = new Peixe("Tubar�o", "Cinzento");
		Peixe1.setTipoAlimentacao("Carn�voro");
		Peixe1.dadosPeixe();
		
		Mamifero UrsoCanada = new Mamifero("Urso-do-Canad�", "Vermelho", 4);
		UrsoCanada.setTipoAlimentacao("Mel");
		UrsoCanada.dadosMamifero(); 
		
		
		
	}
}
