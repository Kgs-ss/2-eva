package unidad4;

import java.time.LocalDate;

public class Animal {
	//varibles primitivas o referencias a otros objetos
	//es recomendable poner private los atributos, objetos inmutables
	
	private String nombre;
	
	private LocalDate fecha;
	
	//constructor, no define el tipo de datos de retorno y puede tener varios parametros formales, mismo nombre que la clase
	//define el estado inicial de un objeto cuando este se crea
		
	public Animal(String nombre, LocalDate fecha) {
		
		this.nombre = nombre;
		this.fecha = fecha;
		
	}
	
	//puede haber mas de un constructor igual, pero con distintos parametros formales que diferenciaran el estado inical de un objeto, sobrecarga de metodos
	//public, protected, private modificadores de acceso: implica la visibilidad del metodo desde otra clase
	//miembro de una clase es un atributo o un metodo, se puede acceder desde el interior de la clase o desde el exterior de la clase
	//se puede generar auto
	
	public Animal(String nombre) {
		
		this.nombre = nombre;
		fecha = LocalDate.now();
	}
	
	//getters y setters
	//se puede generar auto
	//setters modifican el estado de un objeto
	//getters obtienen el estado de un objeto
	//set depende de si se desea que el objeto sea totalmente inmutable

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	//herencia, redefinicion de metodos
	//redefinir el metodo toString
	//se puede generar auto
	@Override //anotacion java, indica que esta redefiniendo un metodo creado en java
	public String toString() {
		return "animal [nombre=" + nombre + ", fecha=" + fecha + "]";
	}

}
