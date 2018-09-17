package ar.com.ftobares.patronesDeComportamiento.memento;

/**
 * Es quien contiene el estado de un objeto
 * */
public class Memento {

	private WizardConfiguration estado;
	
	public Memento(WizardConfiguration wiz) {
		this.estado = wiz;
	}
	
	public WizardConfiguration getEstado() {
		return this.estado;
	}
}
