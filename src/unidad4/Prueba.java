package unidad4;

public class Prueba {
	//static atributo de clase, es parecido una variable global
	static int a = 5;
	//si no lo lleva es un atributo de instancia
	double b;
	
	//existe un constructor por defecto sin parametro
	//si se define uno deja de existir el por defecto
	//un constructor se puede poner como privado, y de alguna forma poder usarlo desde otra clase
	
	public Prueba(int a) {
		//this.a = a; esto lo marca como aviso por ser estatico ahora
		Prueba.a = a;
		
	}
	
	//Al haber hecho un constructor si queremos uno vacio, no podemos usar el por defecto debemos declarar uno nuevo sin parametros
	public Prueba() {
		
		a = 2;
		b = 3;
	}
	
	@Override
	public String toString() {
		return "Prueba [a=" + a + ", b=" + b + "]";
	}
	
	//metodo de clase
	//X no puede acceder a metodos/atributos de instancia
	public static void m() {
		//X System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Prueba p = new Prueba(10);
		System.out.println(p);
		//acceder a un metodo statico
		System.out.println(Prueba.a);

	}

}
