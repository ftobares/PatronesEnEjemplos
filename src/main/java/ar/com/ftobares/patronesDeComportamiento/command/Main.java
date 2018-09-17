package ar.com.ftobares.patronesDeComportamiento.command;

/**
 * Objetivo:
 * Encapsular peticiones en un objeto. De modo de poder encolar ordenes a ser ejecutadas.
 * Sin que el ejecutor tenga conocimientos sobre la implementacion a ejecutarse. 
 * Ademas permite volver atras operaciones o reintentar operaciones fallidas.
 * */
public class Main {
	
	public static void main(String[] args) {
		ejecutarCommand();
	}
	
	public static void ejecutarCommand() {
		Stock tornillo = new Stock("tornillos",500);
		Stock clavo = new Stock("clavos", 30);
		
		ComprarStock comprarTornillos = new ComprarStock(tornillo);
		VenderStock venderClavos = new VenderStock(clavo);
		
		Invoker invoker = new Invoker();
		invoker.takeOrder(comprarTornillos);
		invoker.takeOrder(venderClavos);
		//Puedo agregar una nueva solicitud de una orden ya existente
		invoker.takeOrder(venderClavos);
		
		invoker.placeOrder();		
	}
}
