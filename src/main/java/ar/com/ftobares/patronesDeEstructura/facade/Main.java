package ar.com.ftobares.patronesDeEstructura.facade;

import java.util.List;

/**
 * Objetivo:
 * Proporciona una interfaz para un conjunto de interfaces. Es decir, define una
 * interfaz por la cual pasaran todas las peticiones, de modo de facilitar el uso
 * del sistema y asi evitar que el cliente tenga que conocer las implementeaciones.
 * 
 * Ejemplos de esto, sería una interfaz que permita consultar distintas tablas o
 * incluso distintas bases de datos, sin que el cliente tenga que saber que tablas o
 * que bases de datos deben accederse.
 * Ejemplo:
 * 
 * RepositoryFacade => expone los metodos:
 * 		a) buscarGestion(Long id)
 * 		b) buscarCliente(Long id)
 * 		c) buscarEquipo(Long id)
 * 
 * El cliente con acceder a estos tres metodos consigue toda la información que busca.
 * Pero la complejidad esta en que la información de las gestiones, clientes y equipos
 * estan en distintas tablas (algo previsible) pero además en distintas bases de datos.
 * De modo que es el Facade quien conoce la complejidad del sistema, pero expone una
 * interfaz simple.
 * 
 * Otra forma de implementarlo es la que se ve en el ejemplo a continuación.
 * 
 * */
public class Main {
	
	public static void main(String[] args) {
		ejecutarFacade();
	}

	public static void ejecutarFacade() {
		
		//Instancio la facade (Singleton)
		ServicioPagosFacade facade = new ServicioPagosFacade();
		
		//Busco para el cliente actual, todos los servicios que se vencen
		//en la fecha especificada
		List<Servicio> servicios = facade.buscarServiciosPorVencer("01/08/2018","01/09/2018");
		
		System.out.println("Los siguientes servicios se venceran para el periodo indicado");
		for(Servicio servicio : servicios) {
			System.out.println("Servicio "+servicio.getNombre()+" con monto igual a "+servicio.getImporte());
		}
		
	}

}
