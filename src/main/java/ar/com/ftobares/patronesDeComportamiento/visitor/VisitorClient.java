package ar.com.ftobares.patronesDeComportamiento.visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class VisitorClient {
	
	private Collection<Soldado> soldados = new ArrayList<Soldado>();
	
	VisitorClient(){}
	
	VisitorClient(int cant){
		generarEjercito(cant);
	}
	
	/**
	 * Defino una operacion especifica instanciando el visitante correspondiente.
	 * Aqui a cada elemento le asigno el visitante, el cual ejecutara la operacion
	 * */
	public void entrenamientoFisico() {
		EntrenadorVisitante visitor = new EntrenadorFisicoVisitor();
		for(Soldado soldado : soldados) {
			soldado.accept(visitor);
		}
	}
	
	/**
	 * Defino una operacion especifica instanciando el visitante correspondiente.
	 * Aqui a cada elemento le asigno el visitante, el cual ejecutara la operacion
	 * */
	public void entrenamientoConArmas() {
		EntrenadorVisitante visitor = new EntrenadorConArmasVisitor();
		for(Soldado soldado : soldados) {
			soldado.accept(visitor);
		}		
	}
	
	/**
	 * Defino una operacion especifica instanciando el visitante correspondiente.
	 * Aqui a cada elemento le asigno el visitante, el cual ejecutara la operacion
	 * */
	public void mantenimientoDeArmas() {
		EntrenadorVisitante visitor = new EntrenadorHerreroVisitor();
		for(Soldado soldado : soldados) {
			soldado.accept(visitor);
		}		
	}
	
	
	private void generarEjercito(int cant) {
		for(int i=0; i<=cant; i++) {
			int value = randomInt();
			Soldado soldado;
			if(value <= 35) {
				soldado = new Guerrero("Espada","Escudo Completo");
			}else if(value <=70) {
				soldado = new Arquero("Arco Compuesto",20);
			}else {
				soldado = new Jinete("Caballo de Guerra","Lanza de Caballeria");
			}
			soldados.add(soldado);
		}		
	}
	
	private int randomInt() {
		Random r = new Random();
		int low = 1;
		int high = 100;
		return r.nextInt(high-low) + low;
	}

}
