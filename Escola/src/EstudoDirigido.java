public class EstudoDirigido extends Avaliacao {
	String tema;
	int numeroPaginas;
	double tempo;
	
	public EstudoDirigido(double nota, String tema, int paginas, double tempo){
		this.nota = nota;
		this.tema = tema;
		this.numeroPaginas = paginas;
		this.tempo = tempo;
	}
		
	public String getInfo(){
		String resumo = "Estudo Dirigido" + "\n";
			   resumo += "Nota: " + nota + "\n";
			   resumo += "Tempo de Dura��o: " + Math.round(tempo) + " minutos" + "\n";
			   resumo += "Tema: " + tema + "\n";
			   resumo += "N�mero de P�ginas: " + numeroPaginas;
		
		return resumo;
	}
}
