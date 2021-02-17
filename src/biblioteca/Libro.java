package biblioteca;

public class Libro extends Publicacion {
	
	private String autor;
	private boolean prestado;
	
	public Libro(int codigo, String titulo, int anioPublicacion, String autor) {
		super(codigo, titulo, anioPublicacion);
		this.autor = autor;
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + "," + super.toString() + "]";
	}
	
	

}
