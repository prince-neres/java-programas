import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ExemplosListas {

	public static void main(String[] args) {
		
		List<String> listaDeCompras = new Vector<>();
		
		listaDeCompras.add("Ovos");
		listaDeCompras.add("Leite");
		listaDeCompras.add("Chocolate");
		listaDeCompras.add("Leite");
		
		System.out.println(listaDeCompras);
		
		System.out.println(listaDeCompras.get(1));
		listaDeCompras.remove(1);
		
		listaDeCompras.add("Refrigerante");
		System.out.println(listaDeCompras);
		
		Collections.sort(listaDeCompras);
		System.out.println(listaDeCompras);
		
		
		
	}
	
	static void listaComInt() {
		List<Integer> lista = new ArrayList<>();
		
		lista.add(100);
		lista.add(50);
		lista.add(25);
		
		System.out.println(lista);
		
		System.out.println(lista.get(0));

		lista.remove(1);
		
		System.out.println(lista);

		for (Integer num : lista) {
			System.out.println("-> "+ num);
			System.out.println(lista.indexOf(num));
		}
		
		System.out.println(lista.contains(150));
		Collections.sort(lista);
		System.out.println(lista);
		
	}
	
}