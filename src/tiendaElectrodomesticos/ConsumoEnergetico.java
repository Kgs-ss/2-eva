package tiendaElectrodomesticos;

public enum ConsumoEnergetico {
	
	A(30), B(25), C(20), D(15), E(10), F(5);
	
	private final int valor;
	
	ConsumoEnergetico(int valor) {
	
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}

}
