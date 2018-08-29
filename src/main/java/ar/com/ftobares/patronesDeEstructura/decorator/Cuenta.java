package ar.com.ftobares.patronesDeEstructura.decorator;

public class Cuenta {

	private String nombre;
	
	public Cuenta(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
