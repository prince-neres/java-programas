public class ConversorDeUnidadesDeVolume {
	
	public static void litrosParaCentCubicos(int litros){
		System.out.println(litros + " litros s�o " + litros * 1000 + " cm�");
	}
	
	public static void metrosCubicosParaLitros(int metrosCubicos){
		System.out.println(metrosCubicos + " m3 s�o " + metrosCubicos * 1000 + " litros");
	}
	
	public static void metrosCubicosParaPesCubicos(int metrosCubicos){
		System.out.println(metrosCubicos + " m3 s�o " + metrosCubicos * 35.32 + " ft�");
	}
	
	public static void galaoParaPolegadasCubicas(int galoes){
		System.out.println(galoes + " gal�es americanos s�o " + galoes * 231 + " in�");
	}
	
	public static void galaoParalitros(int galoes){
		System.out.println(galoes + " gal�es americanos s�o " + galoes * 3.785 + " litros");
	}
}
