public class teste{
	public static void main(String[] args){
		
		Filme kingkong = new Filme("King Kong", 2005, "Peter Jackson", true, 129);
		kingkong.adicionarAtor("Naomi Watts");
		kingkong.adicionarAtor("Jack Black");
		kingkong.adicionarAtor("Adrien Brody");
		kingkong.info();
		
		Serie got = new Serie("Game of Thrones", 2011, "Alan Taylor", 8);
		got.adicionarAtor("Emilia Clarke");
		got.adicionarAtor("Sophie Turner");
		got.adicionarAtor("Kit Harington");
		got.adicionarAtor("Maisie Williams");
		got.info();
		
		Documentario life = new Documentario("A Life on Our Planet", 2020, " Alastair Fothergill", false, 114);
		life.info();
		
	}
}
