package ar.com.ftobares.patronesDeCreacion.factorymethod;

public class Cliente {

	private String nombreCliente;
	
	private String direccionCliente;
	
	private String emailCliente;
	
	private Long importeAdeudado;
	
	private String estadoServicio;

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public Long getImporte() {
		return importeAdeudado;
	}

	public void setImporte(Long importe) {
		this.importeAdeudado = importe;
	}

	public String getServicioActivo() {
		return estadoServicio;
	}

	public void setServicioActivo(String servicio) {
		this.estadoServicio = servicio;
	}	
	
}
