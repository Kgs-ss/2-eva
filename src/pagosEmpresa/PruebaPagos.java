package pagosEmpresa;

import java.util.ArrayList;
import java.util.Date;

public class PruebaPagos {

	public static void main(String[] args) {
		
		ArrayList<String> prueba = new ArrayList<>();
		
		prueba.add("camarero");
		
		SociedadAnonima una = new SociedadAnonima("Alon", prueba);
		SociedadAnonima dos = new SociedadAnonima("Juna", prueba);
		SociedadAnonima tres = new SociedadAnonima("Co", prueba);
		
		ArrayList<SociedadAnonima> socios = new ArrayList<>();
		
		socios.add(una);
		socios.add(dos);
		socios.add(tres);
		
		Date fecha = new Date();
		
		Contratista alberto = new Contratista("alberto", "Suares", fecha, "222-3333-11", socios);
		
		Asalariado uno = new Asalariado("Pepe", "Anton", fecha, "111-5555-22", 1200);
		
		EmpresaServicios eservi = new EmpresaServicios("Las vias", "pintura", "888-2222-77");
		
		ArrayList<Transferencia> pagos = new ArrayList<>();
		
		pagos.add(alberto);
		pagos.add(uno);
		pagos.add(eservi);
		
		for (Transferencia t: pagos) {
			
			t.pago(1000);
		}
		
	}

}
