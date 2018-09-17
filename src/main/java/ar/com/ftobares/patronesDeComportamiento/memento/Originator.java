package ar.com.ftobares.patronesDeComportamiento.memento;

/**
 * Es el que conoce el estado actual del objeto, guarda estados en mementos y 
 * sabe como recuperar estados anteriores.
 * */
public class Originator {
	
	private WizardConfiguration estado;
	
	//Guarda el estado actual
	public void setEstado(WizardConfiguration wiz) {
		this.estado = wiz;
	}
	
	//Devuelve el estado actual
	public WizardConfiguration getEstado() {
		return this.estado;
	}
	
	//Guarda el estado actual en un memento y lo retorna
	public Memento guardar() {
		return new Memento(estado);
	}
	
	public void restaurar(Memento m) {
		this.estado = m.getEstado();
	}

}
