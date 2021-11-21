public class Teste {
	public static void main(String[] args) {
		Smartphone xiaomiA2 = new Smartphone("Xiaomi", "2 Ghz 8 Core", "64Gb", "4Gb", "5.99´", "403 pp1", "OI");
		xiaomiA2.trocarOperadora("VIVO");
		xiaomiA2.mostrar();
		
		ComputadorDeMesa inspiron5400 = new ComputadorDeMesa("Dell", "SSD 256Gb", "8Gb", "i5-1135G7 2.4 GHz", "ASUS", "ROG Strix Helios", "RM850x");
		inspiron5400.trocarFonte("Masterwatt 750W");
		inspiron5400.trocarFabricanteGabinete("Pichau");
		inspiron5400.trocarTipogabinete("PG-LK-01");
		inspiron5400.mostrar();
	}
}
