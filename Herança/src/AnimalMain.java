public class AnimalMain {

	public static void main(String[] args) {
		Mamifero Leao = new Mamifero("Leão", "Parda", 4);
		Leao.setTipoAlimentacao("Carnívoro");
		Leao.dadosMamifero(); 
		
		Mamifero Cavalo = new Mamifero("Cavalo", "Marrom", 4);
		Cavalo.setTipoAlimentacao("Herbívoro");
		Cavalo.dadosMamifero(); 
		
		Mamifero Camelo = new Mamifero("Camelo", "Amarelo", 4);
		Camelo.setTipoAlimentacao("Herbívoro");
		Camelo.dadosMamifero(); 
		
		Peixe Peixe1 = new Peixe("Tubarão", "Cinzento");
		Peixe1.setTipoAlimentacao("Carnívoro");
		Peixe1.dadosPeixe();
		
		Mamifero UrsoCanada = new Mamifero("Urso-do-Canadá", "Vermelho", 4);
		UrsoCanada.setTipoAlimentacao("Mel");
		UrsoCanada.dadosMamifero(); 
		
		
		
	}
}
