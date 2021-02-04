package coches;

import java.util.Scanner;

public class pruebaAutomovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		Automovil a = new Automovil("audi", 40, 50, 20);
		Concesionario c = new Concesionario(a);
		Automovil e = new Automovil("bmw", 40, 30, 15);
		Automovil x = new Automovil("opel", 40, 30, 6);
		Automovil o = new Automovil("ford", 40, 30, 3);

		System.out.println(c);
		c.aniade(e);
		c.aniade(x);
		c.aniade(o);

		// Enum¿?
		String[] marcas = { "audi", "bmw", "opel", "ford" };

		// Por alguna razon si le paso el valor que meto en el next directamente no lo
		// coge, entonces recurro a un array del que compruebo el valor de String y devuelvo,
		// el almacenado en lugar del introducido en el s.next(),  seria mejor un enum¿? supongo
		
		for (int i = 0; i < 3; i++) {

			System.out.println("Introduzca modelo");
			String model = s.next();

			for (String indice : marcas) {
				if (model.equals(indice)) {
					System.out.println("Introduzca Kilometros del desplazamiento");
					double km = s.nextDouble();
					km = (double) km;
					
					if (c.coche(indice).desplazar(km) == 0) {
						//c.coche(indice).llenarDeposito();
						System.out.println("El " + indice + " no ha podido realizar el desplazamiento");
					} else
						c.coche(indice).desplazar(km);

				}

			}
	
		}
		System.out.println(c);
		s.close();
	}
}
