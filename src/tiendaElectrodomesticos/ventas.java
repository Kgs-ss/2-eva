package tiendaElectrodomesticos;

import java.util.ArrayList;

public class ventas {

	public static void main(String[] args) {
	
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
 		
		Television hisense = new Television(300, ColorElectrodomestico.NEGRO, ConsumoEnergetico.A, 10, true, 50);
		Frigorifico frigo = new Frigorifico(200, ColorElectrodomestico.AZUL, ConsumoEnergetico.B, 90);
		Lavadora korn = new Lavadora(300, ColorElectrodomestico.BLANCO, ConsumoEnergetico.C, 51, 9);
	
		electrodomesticos.add(hisense);
		electrodomesticos.add(frigo);
		electrodomesticos.add(korn);
		
		for (Electrodomestico e: electrodomesticos) {
			System.out.println(e);
		}
	
	}

}
