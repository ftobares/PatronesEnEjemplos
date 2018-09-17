package ar.com.ftobares.patronesDeComportamiento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Es el encargado de guardar y recuperar los distintos estados
 * */
public class CareTaker {

	private List<Memento> mementos = new ArrayList<>();
	
	public void addMemento(Memento m) {
		mementos.add(m);
	}
	
	public Memento getMemento(int index) {
		return mementos.get(index);
	}
	
}
