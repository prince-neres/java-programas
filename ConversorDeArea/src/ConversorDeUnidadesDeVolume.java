public class ConversorDeUnidadesDeVolume {
	
	public static void litrosParaCentCubicos(int litros){
		System.out.println(litros + " litros são " + litros * 1000 + " cm³");
	}
	
	public static void metrosCubicosParaLitros(int metrosCubicos){
		System.out.println(metrosCubicos + " m3 são " + metrosCubicos * 1000 + " litros");
	}
	
	public static void metrosCubicosParaPesCubicos(int metrosCubicos){
		System.out.println(metrosCubicos + " m3 são " + metrosCubicos * 35.32 + " ft³");
	}
	
	public static void galaoParaPolegadasCubicas(int galoes){
		System.out.println(galoes + " galões americanos são " + galoes * 231 + " in³");
	}
	
	public static void galaoParalitros(int galoes){
		System.out.println(galoes + " galões americanos são " + galoes * 3.785 + " litros");
	}
}
