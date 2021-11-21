public class ConversorUnidadeTempoMain {
	public static void main(String[] args) {
		
		int segundos = ConversorUnidadeTempo.ConverteMinutosParaSegundos(5);
		int minutos = ConversorUnidadeTempo.ConverteHorasParaMinutos(80);
		int horas = ConversorUnidadeTempo.ConverteDiasParaHoras(43);
		int dias = ConversorUnidadeTempo.ConverteSemanasParaDias(6);
		int dias1 = ConversorUnidadeTempo.ConverteMesesParaDias(9);
		int dias2 = ConversorUnidadeTempo.ConverteAnosParaDias(5);
		
		System.out.println(segundos + " segundos");
		System.out.println(minutos + " minutos");
		System.out.println(horas + " horas");
		System.out.println(dias + " dias");
		System.out.println(dias1 + " dias");
		System.out.println(dias2 + " dias");					   
	}
}
