package juegoPok;

import java.util.ArrayList;

public class Entrenador {
	
	private String nombre;
	private int insignias;
	private ArrayList<Pokemon> pokes = new ArrayList<>();
	
	
	public Entrenador(String nombre, ArrayList<Pokemon> pokes) {
		this.nombre = nombre;
		this.insignias = 0;
		this.pokes = pokes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getInsignias() {
		return insignias;
	}

	public void setInsignias(int insignias) {
		this.insignias = insignias;
	}

	public ArrayList<Pokemon> getPokes() {
		return pokes;
	}

	public void setPokes(ArrayList<Pokemon> pokes) {
		this.pokes = pokes;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", insignias=" + insignias + ", pokemons=" + pokes + "]";
	}
	

	
}
