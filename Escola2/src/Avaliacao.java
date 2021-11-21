public abstract class Avaliacao{
	String nome;
	double nota;
	
	public Avaliacao(String nome, double nota){
		
		try{ 	
			if(nota <= 0){
				throw new java.lang.IllegalArgumentException();
			}
		}  catch (java.lang.IllegalArgumentException e) {
			System.out.println("Erro, nota inferior ou igual a 0 em alguma avaliação!");
		} 
	}
	
	public abstract String getInfo();
}
