package tiendaElectrodomesticos;

public class Frigorifico extends Electrodomestico {

	private boolean noFrost;
	
	public Frigorifico(double precio, int peso, boolean noFrost) {
		super(precio, peso);
		this.noFrost = noFrost;
	}
	
	public Frigorifico(double precio, ColorElectrodomestico color, ConsumoEnergetico consumo, int peso, boolean noFrost) {
		super(precio, color, consumo, peso);
		this.noFrost = noFrost;
	}

	public boolean isNoFrost() {
		return noFrost;
	}

	public void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}

	@Override
	public String toString() {
	
		return "Frigorifico: noFrost " + noFrost + ", " + super.toString() + " precioFinal= " + getPrecioFinal();
	
	}
	
//	public static void main (String [] args) {
//		
//	Frigorifico prueba = new Frigorifico(200, ColorElectrodomestico.AZUL, ConsumoEnergetico.A, 90);
//		
//		System.out.println(prueba);
//	}	

}
