public class ConversorDeUnidadesDeArea {

	public static void metrosQuadradosParaPesQuadrados(int metrosQuadrados){
		System.out.println(metrosQuadrados + " m� s�o " + metrosQuadrados * 10.76 + " ft�");
	}
	
	public static void pesQuadradosParaCentQuadrados(int pesQuadrados){
		System.out.println(pesQuadrados + " ft� s�o " + pesQuadrados * 929 + " cm�");
	}
	
	public static void milhasQuadradasParaAcres(int milhasQuadradas){
		System.out.println(milhasQuadradas + " mi� s�o " + milhasQuadradas * 640 + " acres");
	}
	
	public static void acreParaPesQuadrados(int acres){
		System.out.println(acres + " acres s�o " + acres * 43560 + " ft�");
	}
}
