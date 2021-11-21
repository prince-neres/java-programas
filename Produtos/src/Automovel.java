public class Automovel implements IProduto {
	private String nome;
	private String marca;
	private double preco;
	
	public Automovel(String nome, String marca, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	@Override
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}

	@Override
	public double preco() {
		return this.preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public void Info(){	
		System.out.println("Nome: " + getNome());
		System.out.println("Marca: " + getMarca());
		System.out.println("Preço: R$" + preco() + "\n");
	}
	
}
