package ar.com.ftobares.patronesDeComportamiento.memento;

/**
 * Clase que sera instanciada.
 * Simula ser un wizard de configuracion, en el cual tiene distintos pasos
 * y a medida que vas avanzando se van seteando distintos datos. Como es de esperarse
 * se puede volver a pasos anteriores en caso de querer una configuracion distinta
 * a la que se estaba haciendo.
 * */
public class WizardConfiguration {
	
	private int step;
	
	private String nombre;
	
	private String config1;
	
	private String config2;
	
	private String config3;
	
	private String config4;
	
	@Override
	public String toString() {
		switch(step) {
		case 1:
			return "Wizard [nombre="+this.nombre+", config="+this.config1+"]";
		case 2:
			return "Wizard [nombre="+this.nombre+", config="+this.config2+"]";
		case 3:
			return "Wizard [nombre="+this.nombre+", config="+this.config3+"]";
		case 4:
			return "Wizard [nombre="+this.nombre+", config="+this.config4+"]";
		default:
			return "Wizard [nombre="+this.nombre
				+", config1="+this.config1
				+", config2="+this.config2
				+", config3="+this.config3
				+", config4="+this.config4
			+"]";
		}
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getConfig1() {
		return config1;
	}

	public void setConfig1(String config1) {
		this.config1 = config1;
	}

	public String getConfig2() {
		return config2;
	}

	public void setConfig2(String config2) {
		this.config2 = config2;
	}

	public String getConfig3() {
		return config3;
	}

	public void setConfig3(String config3) {
		this.config3 = config3;
	}

	public String getConfig4() {
		return config4;
	}

	public void setConfig4(String config4) {
		this.config4 = config4;
	}
	
	

}
