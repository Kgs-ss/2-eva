package pagosEmpresa;

import java.util.ArrayList;

public class SociedadAnonima extends ServiciosExternos {
	
	ArrayList<String> trabajos = new ArrayList<>();
	
	public SociedadAnonima(String nombre) {
		super(nombre);
		
	}

	public SociedadAnonima(String nombre, ArrayList<String> trabajos) {
		super(nombre);
		this.trabajos = trabajos;
	}

	public String getTrabajos() {
		return trabajos.toString();
	}

	public void setTrabajos(ArrayList<String> trabajos) {
		this.trabajos = trabajos;
	}
	
	public void addTrabajos(String trabajo) {
		
		trabajos.add(trabajo);
	}
	
	public void removeTrabajos(String trabajo) {
		
		trabajos.remove(trabajo);
	}

	@Override
	public String toString() {
		
		return "Sociedad anonima " + super.toString() + " trabajos=" + trabajos;
	
	}
	
//	public static void main (String [] args) {
//		
//		ArrayList<String> prueba = new ArrayList<>();
//		
//		prueba.add("camarero");
//		
//		SociedadAnonima una = new SociedadAnonima("Alon", prueba);
//		
//		System.out.println(una);
//		
//		una.addTrabajos("cocinero");
//		una.addTrabajos("pintor");
//		
//		System.out.println(una);
//		
//		una.removeTrabajos("camarero");
//		
//		System.out.println(una.getTrabajos());
//		
//	}
}
