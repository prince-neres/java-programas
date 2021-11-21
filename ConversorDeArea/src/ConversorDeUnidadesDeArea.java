public class ConversorDeUnidadesDeArea {

	public static void metrosQuadradosParaPesQuadrados(int metrosQuadrados){
		System.out.println(metrosQuadrados + " m² são " + metrosQuadrados * 10.76 + " ft²");
	}
	
	public static void pesQuadradosParaCentQuadrados(int pesQuadrados){
		System.out.println(pesQuadrados + " ft² são " + pesQuadrados * 929 + " cm²");
	}
	
	public static void milhasQuadradasParaAcres(int milhasQuadradas){
		System.out.println(milhasQuadradas + " mi² são " + milhasQuadradas * 640 + " acres");
	}
	
	public static void acreParaPesQuadrados(int acres){
		System.out.println(acres + " acres são " + acres * 43560 + " ft²");
	}
}
