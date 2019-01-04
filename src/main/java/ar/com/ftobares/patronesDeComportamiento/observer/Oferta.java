package ar.com.ftobares.patronesDeComportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Oferta {
	
	private List<OfertaObserver> observadores = new ArrayList<OfertaObserver>();
	private TiposDeOferta estadoActual;
	
	public Oferta() {
		this.estadoActual = TiposDeOferta.SIN_DESCUENTO;
	}
	
	public void addObserver(OfertaObserver observer) {
		observadores.add(observer);
	}
	
	public void removeObserver(OfertaObserver observer) {
		observadores.remove(observer);
	}
	
	public TiposDeOferta getEstado() {
		return this.estadoActual;
	} 
	
	public void setEstado(TiposDeOferta nuevoEstado) {
		this.estadoActual = nuevoEstado;
		notificar();
	}
	
	private void notificar() {
		for(OfertaObserver obs : observadores) {
			obs.update(this.estadoActual);
		}
	}

}
