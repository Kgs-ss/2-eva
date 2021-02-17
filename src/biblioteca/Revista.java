package biblioteca;

public class Revista extends Publicacion {
	
	private int numero;
	private int mes;
	private int dia;
	
	public Revista(int codigo, String titulo, int anioPublicacion, int numero, int mes, int dia) {
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
		this.mes = mes;
		this.dia = dia;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", mes=" + mes + ", dia=" + dia + "," + super.toString() + "]";
	}
	
	

}
