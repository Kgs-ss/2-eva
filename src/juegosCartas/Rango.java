package juegosCartas;

public enum Rango {

	A("As"), DOS("2"), TRES("3"), CUATRO("4"), CINCO("5"), SEIS("6"), SIETE("7"), OCHO("8"), NUEVE("9"), DIEZ("10"), J("Jota"), Q("Queen"), K("King");
	
	private String nombre;

	private Rango(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
