public class Main {

	public static void main(String[] args) {
		Gincana g1 = new Gincana(10, 10, 10);

		g1.adicionaAzul(12);
		g1.removeAzul(0);
		
		g1.adicionaVerde(32);
		g1.removeVerde(0);
		
		g1.adicionaVermerlho(33);
		g1.removeVermelho(0);
		
		g1.placar();
	}
}
