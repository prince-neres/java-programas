
public class Anuncio {
	// Atributos
	String descricao;
	Anunciante anunciante;
	Imovel imovel;
	String dataPublicacao;
	int quantidadeVisualizacoes;
	
	//Métodos
	
	String gerarAnuncio() {
		String anuncio = "Imperdível!\n";
		anuncio += descricao+"\n";
		anuncio += "Resumo:\n"+ imovel.gerarResumo();
		anuncio += "Imóvel anunciado por:\n"+ anunciante.gerarResumo();
		anuncio += "Publicado em "+ dataPublicacao+"\n";
		anuncio += quantidadeVisualizacoes +" pessoas viram este anúncio! Corra para comprar!";
				
		return anuncio;
	}

}
