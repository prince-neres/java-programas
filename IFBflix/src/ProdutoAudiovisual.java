public abstract class ProdutoAudiovisual{
	long id;
	String titulo;
	int ano;
	String diretor;
	
	public ProdutoAudiovisual(String titulo, int ano, String diretor){
		
	}
	
	public abstract void alterarTitulo(String titulo);
	
	public abstract void alterarAno(int ano);
	
	public abstract void alterarDiretor(String diretor);
}
