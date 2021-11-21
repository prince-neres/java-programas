public class Seminario extends Avaliacao{
	String tema;
	double tempDuracao;
	
	public Seminario(String nome, double nota, String tema, double tempo){
		super(nome, nota);
		this.nome = nome;
		this.nota = nota;
		this.tema = tema;
		this.tempDuracao = tempo;
		
		if(nota <= 0){
			this.nota = 10;		
		}

	}
		
	public String getInfo(){
		String resumo = "Seminário" + "\n"; 
			   resumo += "Nota: " + this.nota + "\n";
			   resumo += "Tempo de Prova: " + Math.round(tempDuracao) + " minutos" + "\n";
		       resumo += "Tema do Seminário: " + tema + "\n" + "\n";
		
		return resumo;
	}
	
}
