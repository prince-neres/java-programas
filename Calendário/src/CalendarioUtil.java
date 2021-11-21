import java.util.Calendar;
import java.util.Date;

public class CalendarioUtil {
	
	static Calendar cal = Calendar.getInstance();
	static int dia = cal.get(Calendar.DATE);
	static int mes = cal.get(Calendar.MONTH) + 1;
	static int ano = cal.get(Calendar.YEAR);
	static int hora = cal.get(Calendar.HOUR_OF_DAY);
	static int minuto = cal.get(Calendar.MINUTE);
	static int segundo = cal.get(Calendar.SECOND);
	
	public static void Data() {
		Date data = new Date();
		System.out.println("Data: " + data);
	}
	
	public static void Ano() {
		System.out.println("Ano: " + ano);
	}
	
	public static void Mes() {
		System.out.println("Mês: " + mes);
	}
	
	public static void Dia() {
		System.out.println("Dia: " + dia);
	}
	
	public static void Hora() {
		System.out.println("Hora: " + hora);
	}
	
	public static void Minuto() {
		System.out.println("Minuto: " + minuto);
	}
	
	public static void Segundo() {
		System.out.println("Segundo: " + segundo);
	}
}
