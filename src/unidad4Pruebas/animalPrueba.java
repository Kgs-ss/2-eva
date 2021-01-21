package unidad4Pruebas;

import unidad4.Animal;

public class animalPrueba {

	public static void main(String[] args) {
	
			
			//hay 4 tipos de acceso a los miembros de una clase, public, protected, package, private
			//public desde cualquier sitio
			//protected desde su clase y subclases, y paquete
			//package desde la clase y las que pertenezcan al mismo paquete, no subclases
			//private no hay posibilidad de acceder desde fuera de la clase
			//si no se especifica se aplica package
			
			//creamos uan referencia al objeto
			//invocamos al segundo contructor
			
			Animal a = new Animal("Kayla");
			
			//a.nombre(a, "otro") esto es lo que hace al utitlizar el this
			 a.setNombre("otro");
			
			
			//se puede invocar implicitamente cuando se invoca un string
			System.out.println(a);//a.toString()
		}

	}


