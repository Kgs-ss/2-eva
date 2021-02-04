package coches;

public class Automovil {
	
	private String modelo;
	private double capacidadDeposito;
	private double cantidadDeposito;
	private double consumoPorKm;
	private double kmRecorridosTotal;
	private double combustibleConsumidoTotal;
	
	//creamos los 2 constructores que se piden
	public Automovil(String modelo, double capacidadDeposito, double cantidadInicialLitros, double consumoPorKm) {
		
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		if (cantidadInicialLitros > this.capacidadDeposito) {
			this.cantidadDeposito = this.capacidadDeposito;
		}
		else
		this.cantidadDeposito = cantidadInicialLitros;
		this.consumoPorKm = consumoPorKm;
		this.kmRecorridosTotal = 0;
		this.combustibleConsumidoTotal = 0;
	
	}
	
	public Automovil(String modelo, double capacidadDeposito, double consumoPorKm) {
		
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.consumoPorKm = consumoPorKm;
		this.cantidadDeposito = this.capacidadDeposito;
		this.kmRecorridosTotal = 0;
		this.combustibleConsumidoTotal = 0;
	
	}
	
	//lo dejo que lo unico que se pueda modificar sea la cantidad de combustible, correcto¿?
	//solo set de cantidad de deposito como si solo se le pudiese echar combustible, la cantidad del deposito siempre la misma etc...
	public double getCantidadDeposito() {
		return cantidadDeposito;
	}
	
	public void setCantidadDeposito(double cantidadDeposito) {
		this.cantidadDeposito = cantidadDeposito;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setConsumoPorKm(double consumoPorKm) {
		this.consumoPorKm = consumoPorKm;
	}

	public void setKmRecorridosTotal(double kmRecorridosTotal) {
		this.kmRecorridosTotal = kmRecorridosTotal;
	}

	public void setCombustibleConsumidoTotal(double combustibleConsumidoTotal) {
		this.combustibleConsumidoTotal = combustibleConsumidoTotal;
	}

	public double getCapacidadDeposito() {
		return capacidadDeposito;
	}
	
	public double getConsumoPorKm() {
		return consumoPorKm;
	}
	
	public double getKmRecorridosTotal() {
		return kmRecorridosTotal;
	}
	
	public double getCombustibleConsumidoTotal() {
		return combustibleConsumidoTotal;
	}
	
	//dos metodos para llenar, lleno y lleno(x)
	public void llenarDeposito() {
		this.cantidadDeposito = this.capacidadDeposito;
	}
	//este segundo ademas de cargar el deposito si llena devolvera los litros que no se han podido usar por que superaba
	//la cantidad del deposito, devuelve esa cantidad el sobrante
	public double llenarDeposito(double litros) {
		double sobrante = 0;
		if (this.cantidadDeposito + litros > this.capacidadDeposito) {
			sobrante = (this.cantidadDeposito + litros) - this.capacidadDeposito;	
			this.cantidadDeposito = this.capacidadDeposito;
		}
		else 
			this.cantidadDeposito += litros;
		
		return sobrante;
	}
	
	//Este sirve para hacer y comprobar desplazamientos¿? mas bien comprobar no hay ubicacion
	//se le pasa la distancia y nos dira lo que ha gastado ademas de restarlo del deposito y si no hay combustible para el desplazamiento
	//avisara, retornara la cantidad gastada o 0 si no es posible el desplazamiento
	public double desplazar(double cuantosKilometros) {
		
		double combustibleAConsumir = this.consumoPorKm * cuantosKilometros;
		
		if (this.cantidadDeposito >= combustibleAConsumir) {
			this.cantidadDeposito -= combustibleAConsumir;
			this.kmRecorridosTotal += cuantosKilometros;
			this.combustibleConsumidoTotal += combustibleAConsumir;
			return combustibleAConsumir;
		}
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Automovil [modelo=" + modelo + ", capacidadDeposito=" + capacidadDeposito + ", cantidadDeposito="
				+ cantidadDeposito + ", consumoPorKm=" + consumoPorKm + ", kmRecorridosTotal=" + kmRecorridosTotal
				+ ", combustibleConsumidoTotal=" + combustibleConsumidoTotal + "]";
	}
	
//	probamos funcionamiento
//public static void main(String [] args) {
//		
//	Automovil a = new Automovil("Opel", 30, 15, 3.5);
//		System.out.println(a);
//		double sobra = a.llenarDeposito(30);
//		System.out.println(sobra);
//		a.llenarDeposito();
//		System.out.println(a.desplazar(3));
//		System.out.println(a);
//	a.desplazar(2);
//	System.out.println(a);
//}

}
