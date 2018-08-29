package ar.com.ftobares.patronesDeEstructura.facade;

public class Servicio {
	
	private String nombre;
	
	private Long importe;	

	public Servicio(String nombre, Long importe) {
		super();
		this.nombre = nombre;
		this.importe = importe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getImporte() {
		return importe;
	}

	public void setImporte(Long importe) {
		this.importe = importe;
	}	

}
