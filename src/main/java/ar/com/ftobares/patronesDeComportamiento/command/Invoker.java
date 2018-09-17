package ar.com.ftobares.patronesDeComportamiento.command;

import java.util.ArrayList;
import java.util.List;

/**
 * El invoker es quien sabe como ejecutar un command dado, pero desconoce su
 * implementacion. En algunos casos (como el actual) puede almacenar una lista
 * de ordenes (o colas-queues). Incluso puede tener algunas implementaciones extras
 * como poder volver atras una orden (command) o reintentar una orden que haya fallado.
 * */
public class Invoker {
	
	//Lista o cola de ordenes pendientes
	//Podrian existir otras listas o incluso ser un tipo de lista distinto
	//como lista de prioridad, lista de errores, lista de reintentos, etc.
	private List<Orden> orderList = new ArrayList<Orden>();
		
	//Toma nuevas ordenes y las almacena
	public void takeOrder(Orden orden) {
		orderList.add(orden);
	}

	//Ejecuta todas las ordenes que tiene almacenadas y
	//libera la lista, de modo que mas ordenes puedan ser
	//almacenadas
	public void placeOrder() {
		for(Orden orden : orderList) {
			orden.execute();
		}
		orderList.clear();
	}
}
