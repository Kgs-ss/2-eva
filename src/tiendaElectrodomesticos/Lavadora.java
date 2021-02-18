package tiendaElectrodomesticos;

public class Lavadora extends Electrodomestico {
	
	private double precioVenta;
	//private final int [] distintasCargas = {4,5,6,7,8,10,11,13};
	private int carga = 5;
	
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.precioVenta = precioTotal(this.getConsumo().getValor(), peso);
	}

	public Lavadora(double precioBase, ColorElectrodomestico color, ConsumoEnergetico consumo, int peso) {
		super(precioBase, color, consumo, peso);
		
		this.precioVenta = precioTotal(consumo.getValor(), peso);
		
	}
	
	public Lavadora(double precio, int peso, int carga) {
		super(precio, peso);
		
		this.carga = carga;
		
		if (this.carga > 8) {
			
			this.precioVenta = (this.precioVenta * 10) / 100 + this.precioVenta;
			
		}
	}
	
	
	public Lavadora(double precio, ColorElectrodomestico color, ConsumoEnergetico consumo, int peso, int carga) {
		
		super(precio, color, consumo, peso);
		
		this.precioVenta = precioTotal(this.getConsumo().getValor(), peso);
		
		this.carga = carga;
		
		if (this.carga > 8) {
			
			this.precioVenta = (this.precioVenta * 10) / 100 + this.precioVenta;
			
		}
	}

	@Override
	public String toString() {
		return "Lavadora: carga=" + carga + " " + super.toString() + " precio final= " + precioVenta;
	}

//	public static void main (String [] args) {
//		
//		Lavadora prueba = new Lavadora(300, ColorElectrodomestico.BLANCO, ConsumoEnergetico.A, 51, 9);
//		
//		System.out.println(prueba);
//		
//	}

}
