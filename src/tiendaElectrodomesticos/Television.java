package tiendaElectrodomesticos;

public class Television extends Electrodomestico {

	private boolean dvbt2;
	private int pulgadas = 20;
	
	public Television(double precio, int peso, boolean dvbt2, int pulgadas) {
		super(precio, peso);
		this.dvbt2 = dvbt2;
		this.pulgadas = pulgadas;
	}

	public Television(double precio, ColorElectrodomestico color, ConsumoEnergetico consumo, int peso, boolean dvbt2, int pulgadas) {
		super(precio, color, consumo, peso);
		this.dvbt2 = dvbt2;
		this.pulgadas = pulgadas;
	}

	public boolean isDvbt2() {
		return dvbt2;
	}

	public void setDvbt2(boolean dvbt2) {
		this.dvbt2 = dvbt2;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return "Television: dvbt2 " + dvbt2 + ", pulgadas " + pulgadas + ", " + super.toString() + " precio final= " + getPrecioFinal();
	}
	
//	public static void main (String [] args) {
//		
//		Television prueba = new Television(300, ColorElectrodomestico.NEGRO, ConsumoEnergetico.A, 10, true, 50);
//		System.out.println(prueba);
//	}

}
