
public class TesteMain {

	public static void main(String[] args) {
		
		Imovel imovel1 = new Imovel(400.00, -4, 2, "Asa Norte", "Apartamento", 230.00, "Poente");
		
		System.out.println(imovel1.gerarResumo());

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void aulaS3() {
		Imovel imovel1 = new Imovel(0,0,0, "","", 0,"");
		Anunciante anunciante1 = new Anunciante();
		Anuncio anuncio1 = new Anuncio();
		
		imovel1.localizacao = "Asa Norte";
		imovel1.posicao = "Nascente";
		imovel1.preco = 400000.00;
		imovel1.quantidadeBanheiros = 2;
		imovel1.quantidadeQuartos = 3;
		imovel1.tamanho = 80.0;
		imovel1.tipo = "Apartamento";
		
		anunciante1.email = "vendedor@vendemail.com";
		anunciante1.nome = "Vendedor X";
		anunciante1.propietario = false;
		anunciante1.telefone = "31431412";
		
		anuncio1.descricao = "Apartamento imperdível na Asa norte\n blá blá blá";
		anuncio1.anunciante = anunciante1;
		anuncio1.imovel = imovel1;
		anuncio1.dataPublicacao = "20/03/2021";
		anuncio1.quantidadeVisualizacoes = 342;
		
		System.out.println(anuncio1.gerarAnuncio());
	}
}
