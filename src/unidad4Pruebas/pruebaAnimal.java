package unidad4Pruebas;

import unidad4.animal;

public class pruebaAnimal {

	public static void main(String[] args) {
		
		//hay 4 tipos de acceso a los miembros de una clase, public, protected, package, private
		//public desde cualquier sitio
		//protected desde su clase y subclases
		//package desde la clase y las que pertenezcan al mismo paquete
		//private no hay posibilidad de acceder desde fuera de la clase
		//si no se especifica se aplica package
		
		//creamos uan referencia al objeto
		//invocamos al segundo contructor
		
		animal a = new animal("Kayla");
		
		//a.nombre(a, "otro") esto es lo que hace al utitlizar el this
		 a.setNombre("otro");
		
		
		//se puede invocar implicitamente cuando se invoca un string
		System.out.println(a);//a.toString()
	}

}
