package unidad4;

import java.util.Arrays;

public class Naipe1 {

	
	private String [] palos = {"treboles", "diamantes", "corazones", "picas"};

	private String [] rango = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

	private String [] cartas = new String[52];
	private int carta;
	private String rang;
	private int val;
	
//	public Naipe1() {
//		
//		rang;
//		val;
//	}
//	
	public Naipe1() {
	
		for (int i =0; i < 13; i++) {
			for (String palo : palos) {
				cartas[carta] = rango[i]+ " " + palo ;
				carta++;
			}
		}
		carta = 0;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(cartas) + " ";
	}
	
	public static void main(String[] args) {
		
		Naipe1 n = new Naipe1();
		
		System.out.println(n);
	}
	
	
}
