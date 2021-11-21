public class Bimestre {
	
	Prova av1;
	Seminario av2;
	EstudoDirigido av3;
	
	public Bimestre(Prova av1, Seminario av2, EstudoDirigido av3){
		this.av1 = av1;
		this.av2 = av2;
		this.av3 = av3;
	}
	
	public void imprimirAvaliacoes(){
		System.out.println(av1.getInfo() + av2.getInfo() + av3.getInfo() + "\n");
		System.out.println("Média Final: " + Math.round((av1.nota + av2.nota + av3.nota) / 3));
	}
}
