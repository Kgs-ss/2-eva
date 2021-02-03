package unidad4;

public class PruebaExcepciones {
	
	String s1;
	String s2 = "Hola";
	public void unMetodo() {
		System.out.println(s1.charAt(0));
	}
	public void otroMetodo() {
		System.out.println(s2.charAt(10));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//heredan de exception subclase throwable
		//error casi nada
		//exception : runtimeexception, IOexception, SQLexception, AWTexception
		//runtimeexception, unchecked, no estamos obligados a controlarlas
		//el resto, checked
		
		PruebaExcepciones e = new PruebaExcepciones();
		
		int n = 1;
		
		//prueba el codigo si tiene error lo muestra en el catch
		//exception usa herencia con lo cual si un error es hijo tambien sera exception
		try {
			switch (n) {
			case 1:
				e.unMetodo();
				break;
			
			case 2:
				e.otroMetodo();
				break;
		}
		System.out.println("ese");
		//en el catch lo capturamos y dentro lo manejamos
		//el programa se interrumpe y continua la ejecucion en el catch, si hay codigo debajo no se ejecuta
		
		} catch (Exception i) {
			System.out.println("Hola");
			//muestra propagacion y error
			i.printStackTrace();
		}
		//podemos cambiar el exception por el nombre de error y mostramos otro mensaje
		//debe estar al mismo nivel por lo que se ve si hereda de otra como exception en este caso dice que ya esta manejada
//		catch (NullPointerException i) {
//			System.out.println("hey");
//		}
		// opcional se ejecuta siempre con o sin error
		finally {
			System.out.println("finally");
		}
		
		System.out.println("Fin del programa");
	}

}
