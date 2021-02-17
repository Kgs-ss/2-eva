package coches;

import java.util.ArrayList;

public class Concesionario {
	
	ArrayList<Automovil> autos = new ArrayList<>();
	//ArrayList<Automovil> viajes = new ArrayList<>();
	
	public Concesionario(Automovil coche) {
		autos.add(coche);
	}
	
	public void aniade(Automovil coche) {
		autos.add(coche);
	}
	//nos devuelve el objeto, si se vende por ejemplo lo saco y lo elimino,
	//si se va de viaje deberia sacarlo, pasarlo al de viaje y devolverlo con los cambios
	public Automovil coche(String modelo) {
		for (Automovil a : autos) {
			if (a.getModelo() == modelo) {
				return a;
			}
		}
		return null;
	}
	//quitamos el coche, uno que se vende
	public void eliminarCoche(String modelo) {
		if (coche(modelo) != null) {
			autos.remove(coche(modelo));
		}
		
	}
	

	@Override
	public String toString() {
		return "Concesionario " + autos + "";
	}
	
	
	
	

}
