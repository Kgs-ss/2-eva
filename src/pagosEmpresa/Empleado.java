package pagosEmpresa;

import java.util.Date;

public abstract class Empleado implements Transferencia{

	private String nombre;
	private String apellidos;
	private Date fechaContratacion;
	private String numCuenta;

	public Empleado(String nombre, String apellidos, Date fechaContratacion, String numCuenta) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaContratacion = fechaContratacion;
		this.numCuenta = numCuenta;
	}

	public String getNumCuenta() {
		return numCuenta;
	}
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos  + " " + fechaContratacion
				+ " numCuenta=" + numCuenta ;
	}
	
	
	
}
