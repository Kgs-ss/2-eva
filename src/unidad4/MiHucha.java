package unidad4;

import java.util.Arrays;

public class MiHucha {
	
	private static int [] tipos = { 50, 20, 10, 5, 2, 1};
	
	private int [] desglose = new int[tipos.length];
	
	private boolean abierta;
	
	private String password = "password";
	
	public static final int CINCUENTA = 0;
	public static final int VEINTE = 1;
	public static final int DIEZ = 2;
	public static final int CINCO = 3;
	public static final int DOS = 4;
	public static final int UNO = 5;
	//CONSTRUCTORES
	//no son necesarios todos
	public MiHucha() {
		// TODO Auto-generated constructor stub
	}
	
	public MiHucha (boolean abierta, String password) {
		this.abierta = abierta;
		this.password = password;
	}
	
	public MiHucha (int cincuenta, int veinte, int diez, int cinco, int dos, int uno) {
		
		desglose[0] = cincuenta;
		desglose[1] = veinte;
		desglose[2] = diez;
		desglose[3] = cinco;
		desglose[4] = dos;
		desglose[5] = uno;
	}
	
	public MiHucha (int cincuenta, int veinte, int diez, int cinco, int dos, int uno, boolean abierta) {
		
		this(cincuenta, veinte, diez, cinco, dos, uno);
		this.abierta = abierta;
	}
	
	public MiHucha(int cincuenta, int veinte, int diez, int cinco, int dos, int uno, boolean abierta, String password) {
		
			this(cincuenta, veinte,  diez,  cinco,  dos,  uno, abierta);
			this.password = password;
	}
	
	public MiHucha(int cantidad) {
		
		for (int i = 0; i< tipos.length && cantidad > 0; i++) {
			if (cantidad >= tipos[i])
				desglose[i] = cantidad / tipos[i];
				cantidad %= tipos[i];
		}
		
	}
	
	public MiHucha(int cantidad, boolean abierta) {
		this(cantidad);
		this.abierta = abierta;
	}
	
	public MiHucha(int cantidad, boolean abierta, String password) {
		this(cantidad, abierta);
		this.password = password;
	}
	
	public String toString() {
		
		return Arrays.toString(desglose);
	}
	
	
	public int getDesglose(int tipo) throws Exception {
		
		if (abierta)
			return desglose[tipo];
		else
			throw new Exception("La hucha esta vacia");
	}
	
	public int retirar(int cantidad, int tipo) throws Exception{
		
		if (abierta) {
			if (desglose[tipo] < cantidad) {
				cantidad = desglose[tipo];
			}
			desglose[tipo] -= cantidad;
			return cantidad;
		}
		else
			throw new Exception();
	}
	
	public int retirar(int cantidad) {
		
		
		int devuelve = 0; 
		int total = 0;
		for (int j=0; j<desglose.length;j++) {
			total += desglose[j] * tipos[j]; 
		}
		
		if(cantidad > total) {
			
			return total;	
			
		}
		
		for (int i = 0; i< tipos.length-1 && cantidad > 0; i++) {
		
			if (cantidad >= tipos[i] && desglose[i] > 0) { 
				
				devuelve += (cantidad /tipos[i]) * tipos[i];
				desglose[i] -= cantidad / tipos[i];
			}
				
			cantidad %= tipos[i];
		
		}
		
		return devuelve;
	}
	
	public void abrir(String password) throws Exception {
		if (this.password.equals(password)) {
			this.abierta = true;
		}
		else
			throw new Exception();
	}
	
	public void cerrar(String password) throws Exception {
		if (this.password.equals(password)) {
			this.abierta = false;
		}
		else 
			throw new Exception();
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MiHucha s = new MiHucha(224);
		s.abrir("password");
		System.out.println(s);
		System.out.println(s.getDesglose(CINCUENTA));
		System.out.println(s.retirar(5, MiHucha.CINCUENTA));
		System.out.println(s.retirar(75));
		System.out.println(s);
	}

}
