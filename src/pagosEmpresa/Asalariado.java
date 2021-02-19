package pagosEmpresa;

import java.util.Date;

public class Asalariado extends Empleado {
	
	private double salario;
	
	public Asalariado(String nombre, String apellidos, Date fechaContratacion, String numCuenta, double salario) {
		super(nombre, apellidos, fechaContratacion, numCuenta);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Asalariado " + super.toString() + " salario= " + salario + " €";
	}

	
	public void pago(double dinero) {
	
		System.out.println("el asalariado " + getNombre() + " ha recibido en la cuenta " + getNumCuenta() + " la cantidad de " + dinero + " €");
	}
		
}
