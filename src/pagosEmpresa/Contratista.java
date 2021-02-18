package pagosEmpresa;

import java.util.ArrayList;
import java.util.Date;

public class Contratista extends Empleado {
	
	ArrayList<SociedadAnonima> sociedades = new ArrayList<>();
	
	public Contratista(String nombre, String apellidos, Date fechaContratacion, String numCuenta) {
		super(nombre, apellidos, fechaContratacion, numCuenta);
		
	}

	public Contratista(String nombre, String apellidos, Date fechaContratacion, String numCuenta, ArrayList<SociedadAnonima> sociedades) {
		
		super(nombre, apellidos, fechaContratacion, numCuenta);
		this.sociedades = sociedades;
	
	}

	public String getSociedades() {
		return sociedades.toString();
	}

	public void setSociedades(ArrayList<SociedadAnonima> sociedades) {
		this.sociedades = sociedades;
	}
	
	public void addSociedad(SociedadAnonima sociedad) {
		
		sociedades.add(sociedad);
	}
	
	public void removeSociedad(SociedadAnonima sociedad) {
		
		sociedades.remove(sociedad);
	}

	@Override
	public String toString() {
		
		return "Contratista " + super.toString() + " sociedades=" + sociedades;
	
	}

	@Override
	public void pago() {}

	@Override
	public void pago(double dinero) {
		
		System.out.println("el contratista " + getNombre() + " ha recibido en la cuenta " + getNumCuenta() + " la cantidad de " + dinero + " €");
		
	}
	
	
	
//	public static void main (String [] args ) {
//		
//		ArrayList<String> prueba = new ArrayList<>();
//		
//		prueba.add("camarero");
//		
//		SociedadAnonima una = new SociedadAnonima("Alon", prueba);
//		SociedadAnonima dos = new SociedadAnonima("Juna", prueba);
//		SociedadAnonima tres = new SociedadAnonima("Co", prueba);
//		
//		ArrayList<SociedadAnonima> socios = new ArrayList<>();
//		socios.add(una);
//		socios.add(dos);
//		socios.add(tres);
//		Date fecha = new Date();
//		
//		Contratista alberto = new Contratista("alberto", "Suares", fecha, "222-3333-11", socios);
//		
//		System.out.println(alberto);
//		
//	}
	
}
