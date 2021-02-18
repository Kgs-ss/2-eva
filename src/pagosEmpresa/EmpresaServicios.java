package pagosEmpresa;

public class EmpresaServicios extends ServiciosExternos implements Transferencia{
	
	private String servicio;
	private String numCuentaServicio;
	
	public EmpresaServicios(String nombre) {
		super(nombre);
	}

	public EmpresaServicios(String nombre, String servicio, String numCuentaServicio) {
		super(nombre);
		this.servicio = servicio;
		this.numCuentaServicio = numCuentaServicio;
	}

	public String getNumCuentaServicio() {
		return numCuentaServicio;
	}

	public void setNumCuentaServicio(String numCuentaServicio) {
		this.numCuentaServicio = numCuentaServicio;
	}

	public String getServicio() {
		return servicio;
	}

	@Override
	public String toString() {
		
		return "EmpresaServicios " + super.toString()  + servicio + " numCuentaServicio=" + numCuentaServicio;
	
	}

	@Override
	public void pago() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void pago(double dinero) {
		
		System.out.println("la empresa de servicios " + getNombre() + " ha recibido en la cuenta " + getNumCuentaServicio() + " la cantidad de " + dinero + " €");
		
	}

}
