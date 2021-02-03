package unidad4;

import java.util.Arrays;

public class Libro {
	
	private String titulo;
	private float precio;
	private int stock;
	private String [] autor;
	
	public Libro(String titulo, float precio, int stock, String[] autor) {
		
		this.titulo = titulo;
		this.precio = precio;
		this.stock = stock;
		this.autor = autor;
		
	}
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public String[] getAutor() {
		return autor;
	}



	public void setAutor(String[] autor) {
		this.autor = autor;
	}

	

	@Override
	public String toString() {
		return titulo + " " + Arrays.toString(autor) + " precio=" + precio + " € stock=" + stock;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] autores = {"pepe", "juan"}; 
		Libro l = new Libro("El porque de las cosas", (float)12.70, 3 , autores);
		
		System.out.println(l);
	}
	
	

}
