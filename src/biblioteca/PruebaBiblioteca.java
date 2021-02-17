package biblioteca;

import java.util.ArrayList;

public class PruebaBiblioteca {

	public static void main(String[] args) {
		
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		
		Libro libro1 = new Libro(1, "El mundo", 12, "Julio Cesar");
		Revista revista1 = new Revista(2, "Informática moderna", 2030, 1, 1, 5);
		
		System.out.println(libro1);
		System.out.println(revista1);
		
		publicaciones.add(libro1);
		publicaciones.add(revista1);
		
		System.out.println();
		
		for (Publicacion p: publicaciones) {
			
			System.out.println(p);
			
		}
	}

}
