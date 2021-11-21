public class ConversaoMain {
	public static void main(String[] args) {
		System.out.println("----Unidades-de-Área----");
		ConversorDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(10);
		ConversorDeUnidadesDeArea.pesQuadradosParaCentQuadrados(10);
		ConversorDeUnidadesDeArea.milhasQuadradasParaAcres(10);
		ConversorDeUnidadesDeArea.acreParaPesQuadrados(10);
		System.out.println("---Unidades-de-Volume---");
		ConversorDeUnidadesDeVolume.litrosParaCentCubicos(10);
		ConversorDeUnidadesDeVolume.metrosCubicosParaLitros(10);
		ConversorDeUnidadesDeVolume.metrosCubicosParaPesCubicos(10);
		ConversorDeUnidadesDeVolume.galaoParaPolegadasCubicas(10);
		ConversorDeUnidadesDeVolume.galaoParalitros(10);
	}
}
