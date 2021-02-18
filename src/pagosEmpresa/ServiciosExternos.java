package pagosEmpresa;

public abstract class ServiciosExternos {
	
	private String nombre;

	public ServiciosExternos(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return  nombre;
	}
	
}
