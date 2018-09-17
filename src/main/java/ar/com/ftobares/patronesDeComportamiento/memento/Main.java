package ar.com.ftobares.patronesDeComportamiento.memento;

/**
 * Objetivo:
 * Busca que un objeto cuyo estado ha cambiado, pueda retornar a un estado anterior.
 * Es decir, tener la capacidad de hacer check points de los estados de un objeto para
 * retornar a ellos. 
 * Esto de todas formas debe realizarse sin violar el concepto de encapsulamiento.
 * */
public class Main {
	
	public static void main(String[] args) {
		ejecutarMemento();
	}
	
	public static void ejecutarMemento() {
		
		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator();
		
		WizardConfiguration wiz = new WizardConfiguration();
		wiz.setStep(1);
		wiz.setNombre("Configurar Nombre");
		wiz.setConfig1("Gestiones por Mora");
		
		//Seteo estado del primer paso
		originator.setEstado(wiz);
		
		//Lo guardo
		careTaker.addMemento(originator.guardar());
		
		wiz = new WizardConfiguration();
		wiz.setStep(2);
		wiz.setNombre("Configurar tipo cliente");
		wiz.setConfig2("Clientes Grandes Cuentas");
		
		//Cambio el estado actual del objeto
		originator.setEstado(wiz);
				
		//Guardo el estado del segundo paso
		careTaker.addMemento(originator.guardar());
		
		wiz = new WizardConfiguration();
		wiz.setStep(3);
		wiz.setNombre("Configurar Permisos Usuario");
		wiz.setConfig3("AP | ST | CC");
		
		//Cambio el estado actual del objeto
		originator.setEstado(wiz);
				
		//Guardo el estado del tercer paso
		careTaker.addMemento(originator.guardar());
		
		wiz = new WizardConfiguration();
		wiz.setStep(4);
		wiz.setNombre("Configurar duración gestion");
		wiz.setConfig4("90 dias");
		
		//Cambio el estado actual del objeto
		originator.setEstado(wiz);
				
		//Guardo el estado del cuarto paso
		careTaker.addMemento(originator.guardar());
		
		System.out.println("El estado actual es "+originator.getEstado());
		
		System.out.println("Recupero el estado del primer paso");
		originator.restaurar(careTaker.getMemento(0));
		System.out.println("El estado del primer paso "+originator.getEstado());
		
		System.out.println("Recupero el estado del segundo paso");
		originator.restaurar(careTaker.getMemento(1));
		System.out.println("El estado del segundo paso "+originator.getEstado());
		
		System.out.println("Recupero el estado del tercer paso");
		originator.restaurar(careTaker.getMemento(2));
		System.out.println("El estado del tercer paso "+originator.getEstado());
		
		System.out.println("Vuelvo a recupero el estado del cuarto y ultimo paso");
		originator.restaurar(careTaker.getMemento(3));
		System.out.println("El estado del cuarto paso "+originator.getEstado());
	}

}
