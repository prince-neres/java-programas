public class Aluno {
	public class Aluno implements Comparable<Aluno>{
		private long matricula;
		private String nome;
		private String curso;
		
		public long getMatricula() {
			return matricula;
		}
		public void setMatricula(long matricula) {
			this.matricula = matricula;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		
		public String toString(){
		    return "Aluno: " + getNome() + "\n" + 
			"Matrícula: " + getMatricula() + "\n" + 
			"Curso: " + getCurso();    
		}

		public int compareTo(Aluno o) {
			return 0;
		}
	}

}
