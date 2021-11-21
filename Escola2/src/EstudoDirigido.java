public class EstudoDirigido extends Avaliacao {
	String tema;
	int numeroPaginas;
	double tempo;
	
	public EstudoDirigido(String nome, double nota, String tema, int paginas, double tempo){
		super(nome, nota);
		
		this.nome = nome;
		this.nota = nota;
		this.tema = tema;
		this.numeroPaginas = paginas;
		this.tempo = tempo;
		
		if(nota <= 0){
			this.nota = 10;		
		}
		
	}
		
	public String getInfo(){
		String resumo = "Estudo Dirigido" + "\n";
			   resumo += "Nota: " + this.nota + "\n";
			   resumo += "Tempo de Duração: " + Math.round(tempo) + " minutos" + "\n";
			   resumo += "Tema: " + tema + "\n";
			   resumo += "Número de Páginas: " + numeroPaginas;
		
		return resumo;
	}
}
