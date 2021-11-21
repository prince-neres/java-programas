public class Seminario extends Avaliacao{
	String tema;
	double tempDuracao;
	
	public Seminario(double nota, String tema, double tempo){
		this.nota = nota;
		this.tema = tema;
		this.tempDuracao = tempo;
	}
		
	public String getInfo(){
		String resumo = "Seminário" + "\n"; 
			   resumo += "Nota: " + nota + "\n";
			   resumo += "Tempo de Prova: " + Math.round(tempDuracao) + " minutos" + "\n";
		       resumo += "Tema do Seminário: " + tema + "\n" + "\n";
		
		return resumo;
	}
	
}
