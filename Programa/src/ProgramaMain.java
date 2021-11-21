public class ProgramaMain {

	public static void main(String[] args) {
		Programa BlocoDeNotas = new Programa();
		BlocoDeNotas.setNome("Evernote");
		BlocoDeNotas.setVersao("10.13.1");
		BlocoDeNotas.setFabricante("Evernote Corporation");
		BlocoDeNotas.setNumeroRegistro(61384);
		BlocoDeNotas.Mostrar();
		
		Programa GaleriaDeFotos = new Programa();
		GaleriaDeFotos.setNome("Quickpic");
		GaleriaDeFotos.setVersao("9.0.0");
		GaleriaDeFotos.setFabricante("Quickpic Developer Team");
		GaleriaDeFotos.setNumeroRegistro(278524980);
		GaleriaDeFotos.Mostrar();

	}
}
