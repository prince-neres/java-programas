public class Testes {
	public static void main(String[] args) {
		
		Casa c1 = new Casa();
		c1.setAreaTotal(200);
		c1.setLocal("Bras�lia - DF");
		c1.setTamanho(150);
		
		Apartamento ap1 = new Apartamento();
		ap1.elevador = false;
		ap1.garagem = true;
		ap1.setLocal("Rio de Janeiro - RJ");
		ap1.setTamanho(100);
		
		Propietario p1 = new Propietario();
		p1.setNome("Marcos");
		p1.Imoveis.add(c1);
		p1.Imoveis.add(ap1);
		p1.imprimir();
	
		
	}
}
