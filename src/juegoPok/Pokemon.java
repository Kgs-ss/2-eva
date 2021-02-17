package juegoPok;

public class Pokemon {

	private Pokemons nombre;
	private Tipos tipo;
	private int vida;
	private int atk;
	private int vidaRestante;
	
	public Pokemon() {
		
	}
	
	public Pokemon (Pokemons nombre, Tipos tipo, int atk, int vida) {
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.atk = atk;
		this.vida = vida;
		this.vidaRestante = vida;
		
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Pokemons getNombre() {
		return nombre;
	}

	public Tipos getTipo() {
		return tipo;
	}
	
	public int getVidaRestante() {
		return vidaRestante;
	}

	public void setVidaRestante(int vidaRestante) {
		this.vidaRestante = vidaRestante;
	}

	public int getAtk() {
		return atk;
	}
	
	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", vida=" + vida + ", atk=" + atk + ", vidaRestante="
				+ vidaRestante + "]";
	}

	public static void main (String [] args) {
		
		Pokemon x = new Pokemon(Pokemons.ALAKAZAM, Tipos.PSIQUICO, 50, 100);
		System.out.println(x.getNombre());
		
	}
	
}
