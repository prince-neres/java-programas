public class BimestreTesteMain {
	public static void main(String[] args) {
		Prova p1 = new Prova("Prince Neres", 0, 60, 30, true);
		Seminario s1 = new Seminario("Prince Neres", 100, "Matem?tica", 60);
		EstudoDirigido e1 = new EstudoDirigido("Prince Neres", 100, "Educa??o F?sica", 5, 60);
		
		Bimestre b1 = new Bimestre(p1, s1, e1);
		b1.imprimirAvaliacoes();
		
	}
}
