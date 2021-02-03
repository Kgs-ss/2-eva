package juegosCartas;

public class Naipe {
	
	private Palo palo;
	private Rango rango;
	private int valor;
	
	public Naipe(Palo palo, Rango rango, int valor) {
		
		this.palo = palo;
		this.rango = rango;
		this.valor = valor;
	}
	
	public Naipe(Palo palo, Rango rango) {
		//super();
		this.palo = palo;
		this.rango = rango;
	}
	
	public Palo getPalo() {
		return palo;
	}

	public Rango getRango() {
		return rango;
	}

	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return   rango + " " + palo;
	}

	public static void main(String[] args) {
		
		Naipe n = new Naipe(Palo.CORAZONES, Rango.A, 1);
		
		System.out.println(n);
	}
}
