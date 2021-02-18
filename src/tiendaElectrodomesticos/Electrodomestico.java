package tiendaElectrodomesticos;

public abstract class Electrodomestico {
	
	private double precio = 100;
	private ColorElectrodomestico color = ColorElectrodomestico.BLANCO;
	private ConsumoEnergetico consumo = ConsumoEnergetico.F;
	private int peso = 5;
	private double precioFinal;
	
	
	public Electrodomestico(double precio, int peso) {

		this.precio = precio;
		this.peso = peso;
	}



	public Electrodomestico(double precio, ColorElectrodomestico color, ConsumoEnergetico consumo, int peso) {
	
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		this.precioFinal = precioTotal(consumo.getValor(), peso);
	}


	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getPrecioFinal() {
		return precioFinal;
	}



	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}



	public ColorElectrodomestico getColor() {
		return color;
	}

	public void setColor(ColorElectrodomestico color) {
		this.color = color;
	}

	public ConsumoEnergetico getConsumo() {
		return consumo;
	}

	public void setConsumo(ConsumoEnergetico consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	//Debo hacer esto aqui?¿??¿?¿?¿
	public double precioTotal(int valorConsumo, int peso) {
		int precioPeso = 0;
		
		if (peso < 20)
			precioPeso = 5;
		else if (peso < 50)
			precioPeso = 10;
		else if (peso < 80)
			precioPeso = 15;
		else if (peso > 80)
			precioPeso = 20;
		
		//podria al ser 100 sumarle directamente el valor? 
		precioFinal = (this.precio * valorConsumo) / 100 + (this.precio * precioPeso) / 100 + this.precio;

		return precioFinal;
	}
	
	@Override
	public String toString() {
		
		return "precio base=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso;
	
	}	
	
}
