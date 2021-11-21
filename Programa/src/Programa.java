public class Programa {
	private String nome;
	private String versao;
	private String fabricante;
	private long numeroRegistro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public long getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public void Mostrar() {
		System.out.println("Nome: " + getNome());
		System.out.println("Versão: " + getVersao());
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("Número de Registro: " + getNumeroRegistro() + "\n");
	}
		
}
