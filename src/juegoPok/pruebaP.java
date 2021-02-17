package juegoPok;

import java.util.ArrayList;

public class pruebaP {
	
	public static void main(String [] args) {
		
		int turno = 1;
		boolean fin = false;
	
		Pokemon atacante = new Pokemon();
		Pokemon defensor = new Pokemon();
	
		Pokemon lapras = new Pokemon(Pokemons.LAPRAS, Tipos.AGUA, 130, 240);
		Pokemon alakazam = new Pokemon(Pokemons.ALAKAZAM, Tipos.PSIQUICO, 150, 160);
		Pokemon mew = new Pokemon(Pokemons.MEW, Tipos.PSIQUICO, 190, 200);
		Pokemon venusaur = new Pokemon(Pokemons.VENUSAUR, Tipos.PLANTA, 110, 290);
		Pokemon gengar = new Pokemon(Pokemons.GENGAR, Tipos.FANTASMA, 180, 120);
		Pokemon zapdos = new Pokemon(Pokemons.ZAPDOS, Tipos.RAYO, 170, 190);
		
		ArrayList<Pokemon> pokemonsS = new ArrayList<>();
		pokemonsS.add(venusaur);
		pokemonsS.add(lapras);
		pokemonsS.add(alakazam);
		
		ArrayList<Pokemon> pokemonsAsh = new ArrayList<>();
		pokemonsAsh.add(mew);
		pokemonsAsh.add(gengar);
		pokemonsAsh.add(zapdos);
		
		Entrenador s = new Entrenador("S", pokemonsS);
		
		Entrenador ash = new Entrenador("Ash", pokemonsAsh);
		
		do {
			//Son combates de 3 pokemon pero se usa un de cada vez break
			//s sera atacante si es != 0
			for (Pokemon x : s.getPokes()) {
				if (turno % 2 != 0) 
					atacante = x;
				else
					defensor = x;
				break;
			}
			for (Pokemon x : ash.getPokes()) {
				if (turno % 2 == 0) 
					atacante = x;
				else
					defensor = x;
				break;
			}
			System.out.println("atacante: " + atacante.getNombre() + " - ataque: " + atacante.getAtk() + " vida: " + atacante.getVidaRestante() + "/" + atacante.getVida());
			System.out.println("defensor: " + defensor.getNombre() +  " - vida: " + defensor.getVidaRestante() + "/" + defensor.getVida());
			System.out.println();
			
			//calculo la vida que le quedara 
			int danio = defensor.getVidaRestante() - atacante.getAtk();
			
			defensor.setVidaRestante(danio);
			
			//LO HACIA AL REVES, TENER CUIDAO S ES DEFENSOR EN 2 == 0 WWWWWWWWWWWWW
			if (defensor.getVidaRestante() <= 0 && turno % 2 == 0) {
				
				s.getPokes().remove(0);
				
			}
			
			else if (defensor.getVidaRestante() <= 0 && turno % 2 != 0){
				
				ash.getPokes().remove(0);
			}
		
			turno++;
			
			if (s.getPokes().isEmpty()) {
				System.out.println("supervivientes s: " + s.getPokes());
				System.out.println("supervivientes ash: " + ash.getPokes());
				System.out.println(s.getNombre() + " ha perdido");
				ash.setInsignias(ash.getInsignias() + 1);
				System.out.println(ash.getNombre() + " es el ganador y tiene " + ash.getInsignias() + " insignias");
			}
			
			else if (ash.getPokes().isEmpty()) {
				System.out.println("supervivientes s: " + s.getPokes());
				System.out.println("supervivientes ash: " + ash.getPokes());
				System.out.println(ash.getNombre() + " ha perdido");
				s.setInsignias(s.getInsignias() + 1);
				System.out.println(s.getNombre() + " es el ganador y tiene " + s.getInsignias() +" insignias");
			}
			
			if (s.getPokes().isEmpty() || ash.getPokes().isEmpty()) {
				fin = true;
			}
			
		}while (!fin);
		
	}

}
