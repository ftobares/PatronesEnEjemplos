package ar.com.ftobares.patronesDeEstructura.proxy;

/**
 * Objetivo:
 * Proporciona un representante o sustituto de otro objeto para controlar
 * el acceso a este. Tambien puede utilizarse para agregar funcionalidades
 * a codigos legacy o codigos que no deben modificarse.
 * Todo esto se hace generando una clase envolvente, que implemente los
 * mismos metodos pero agregue la implementación necesaria.
 * 
 * Casos comunes:
 * a) Un representante local de un objeto remoto.
 * b) Un representante virtual, objeto que simula otro objeto que es costoso de crear
 * c) Un proxy de proteccion, un objeto que proteje el acceso a otro objeto.
 * d) Un objeto más inteligente, que el objeto al que envuelve. Agrega logica.
 * 
 * */
public class Main {
	
	public static void main(String[] args) {
		
//		ejecutarProxyC();
		
//		ejecutarProxyD();		
		
	}
	
	public static void ejecutarProxyC() {
		//TODO Agregar ejemplo de proxy de proteccion
	}
	
	public static void ejecutarProxyD() {
		Cuenta cuentaProxy = new CuentaProxy(new CuentaPagoFacil());
		System.out.println("El monto total a pagar sería de "+cuentaProxy.calcularComisionTransaccion(3425L));		
	}

}
