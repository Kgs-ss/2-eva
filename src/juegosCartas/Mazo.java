package juegosCartas;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	
	Random r = new Random();
	
	private ArrayList<Naipe> cartas = new ArrayList<Naipe>();
	private ArrayList<Naipe> descarte = new ArrayList<Naipe>();
	
	public Mazo() {
		agregarBaraja();
		
	}
	//Si se le pasa junto a un int agregara n brajas
	public Mazo(int cuantos) {
		for (int i = 0; i < cuantos; i++) {
			
			agregarBaraja();
			
		}
	}
	//creara la baraja, una carta por cada valor en los enums Palo y Rango
	private void agregarBaraja() {
		for (Palo p: Palo.values()) {
			for (Rango r: Rango.values()) {
				
				cartas.add(new Naipe(p, r));
				
			}
		}
		
	}
	//da un naipe aleatorio para evitar el barajado y ademas lo saca de la baraja y lo añade a un arraylist de descartes 
	public Naipe getNaipe() {
			//coge un ramdon menor que el tamaño del array list y lo devuelve
			Naipe s = cartas.remove(r.nextInt(cartas.size()));
			descarte.add(s);
			return s;
	}
	
	//cuando se acabe el juego o lo por cualquier otra circunstacia se podra reiniciar 
	//esto añadira todas las cartas que se hayan sacado de nuevo al arraylist naipes, teniendolo de nuevo completo
	// si no se extraen todos, añadira al final los extraidos
	public void reset() {
		cartas.addAll(descarte);
		descarte.clear();
	}
	
@Override
	public String toString() {
		return  cartas + "";
	}


public static void main(String[]args) {
	
	Mazo m = new Mazo();
	
	//System.out.println(m);
	
	for (int i = 0; i < 1 ; i++)
		System.out.println(m.getNaipe());

	System.out.println(m);
	m.reset();
	System.out.println(m);
}

}