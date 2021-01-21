package unidad4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Hucha {
	//asi se declaran las constantes
	//podemos declarar esto para luego usarlo en el indice
	public static final int CINCUENTA = 0;
	public static final int VEINTE = 1;
	public static final int DIEZ = 2;
	public static final int CINCO = 3;
	public static final int DOS = 4;
	public static final int UNO = 5;
	//array con los valores de los billetes
	//porque el valor de los billetes suponemos en este caso que no va a cambiar, misma moneda
	//ahorra memoria
	private static int [] tipos = {50,20,10,5,2,1};
	//lo hariamos de 6 pero mirando a futuro por si añadimos otros billetes monedas lo asignamos al length de tipos de billete
	//sera la contidad de billetes de cada tipo
	private int [] desglose = new int[tipos.length];
	//el estado 
	private boolean abierta;
	//contraseña
	private String password;
	
	//tenenmos que construir 3, vacia, con una cantidad especificada de billetes y monedas, o un total de dinero que se desglosa en el minimo 
	//numero de billetes y monedas
	
	//vacia
	public Hucha() {
		//se podria inicializar dentro y luego llamarlo en cada uno de los otros para usar lo contenido, la inicializacion en este caso
		//desglose = new int[tipos.length];
	}
	public Hucha(boolean abierta, String password) {
		//se haria con este this
		//this();
		this.abierta = abierta;
		this.password = password;
	}
	//la creamos con el desglose de billetes
	public Hucha(int cincuenta, int veinte, int diez, int cinco, int dos, int uno) {
		
				desglose[0]= cincuenta;
				desglose[1]=veinte;
				desglose[2]=diez;
				desglose[3]=cinco;
				desglose[4]=dos;
				desglose[5]=uno;
		
	}
	
	//ahora otro que ademas diga que esta abierta
	public Hucha(int cincuenta, int veinte, int diez, int cinco, int dos, int uno, boolean abierta) {
		//aplicando lo visto inicializando usando el anterior
		this(cincuenta, veinte,  diez,  cinco,  dos,  uno);
		this.abierta = abierta;
	}
	//mas contraseña
	public Hucha(int cincuenta, int veinte, int diez, int cinco, int dos, int uno, boolean abierta, String password) {
	//aplicando lo visto inicializando usando el anterior
		this(cincuenta, veinte,  diez,  cinco,  dos,  uno, abierta);
		this.password = password;
	}
	
	public Hucha(int cantidad) {
		//Coge la cantidad de dinero que tiene la hucha, si es mayor que tipos[0], 220 > 50, desglose[i] = 220 / 50 = 4 los billetes de 50
		//cantidad %= tipos[i], 220 % 50 = cantidad, valdra 20, lo que sobra de dinero y la cantidad en la siguiente iteracion
		for (int i = 0; i< tipos.length && cantidad > 0; i++) {
			if (cantidad >= tipos[i])
				desglose[i] = cantidad / tipos[i];
				cantidad %= tipos[i];
		}
		
	}
	public Hucha(int cantidad, boolean abierta) {
		this(cantidad);
		this.abierta = abierta;
	}
	public Hucha(int cantidad, boolean abierta, String password) {
		this(cantidad, abierta);
		this.password = password;
	}
	//¿?¿?¿?¿?
	public String toString() {
		
		return Arrays.toString(desglose);
	}
	
	//para hacerlo bien no retoramos desglose sino un tipo y no retornamos todo el array []
	//el metodo nos devuelve l numero de billetes de un tipo dado
	public int getDesglose(int tipo) {
		//debemos controlar las opciones que pueden entrar para que no de los errores if para impiderli NO excepcion¿?
		return desglose[tipo];
			
	}
	
	
	//este servira para sacar dinero, tantos billetes de tal cantidad
	public int retirar(int cantidad, int tipo) {
		if (desglose[tipo] < cantidad) {
			cantidad = desglose[tipo];
		}
		desglose[tipo] -= cantidad;
		
		return cantidad;
	}
	
	
	//Con esto sobrecargamos el metodo retirar, retira total euros, debe ser pido tanto y me debe devolver la cantidad,
	//si hay suficiente, en el menor numero de billetes posible
	public int retirar(int cantidad) {
		//pido dinero
		// miro a ver si hay la cantidad suficiente
		//lo desgloso
		//lo doy devuelvo
		//resto lo sacado
		//modificar esto para uqe haga lo que pedimos
		//Devolvera la cantidad pedida excepto si no tiene dinero para ello, si se piden 75 y hay 74 devuelve 70
		//no quedara en negativo, ¿Si se piden 75 y hay 74, devolver 74? 
		int devuelve = 0;
		for (int i = 0; i< tipos.length && cantidad > 0; i++) {
			if (cantidad >= tipos[i] && desglose[i] > 0) { // && cantidad / tipos[i] > 0 
				
				devuelve += (cantidad /tipos[i]) * tipos[i];
				//System.out.println(devuelve);
				desglose[i] -= cantidad / tipos[i];
			}
			
			cantidad %= tipos[i];
			
		}
		return devuelve;
	}
	
	public static void main(String[] args) {
		//usamos el constructor Hucha(int cantidad)
		Hucha h = new Hucha(224);
		//si trajesemos la referencia al array posdriamos modificarlo mala practica
		//h.getDesglose() [1] = 2;
		System.out.println(h);
		//asi retornaria el valor de los billetes de 50 posicion de del array que se le pasa a desglose[tip]
		System.out.println(h.getDesglose(0));
		//ESTO SERIA LO MISMO usando las constantes
		System.out.println(h.getDesglose(Hucha.CINCUENTA));
		//usamos retirar
		System.out.println(h.retirar(3, Hucha.CINCUENTA));
		System.out.println(h.retirar(75));
		
		System.out.println(h);
	}
}
