package ar.com.ftobares.patronesDeComportamiento.observer;

/**
 * Objetivo:
 * Es utilizado cuando existe una relacion uno a muchos. Donde al modificarse el estado de
 * un objeto, muchos objetos se veran afectados. 
 * Para evitar que los objetos dependientes esten consultando de forma continua al objeto
 * si fue modificado, se implementa una logica de suscripcion. De esta forma, si el objeto se
 * modifica se le notifica a los suscriptores sobre el cambio. 
 * */
public class Main {
	
	public static void main(String[] args) {
		ejecutarObserver();
	}
	
	public static void ejecutarObserver() {
		Oferta oferta = new Oferta();
		
		oferta.addObserver(new SuscriptorUno());
		oferta.addObserver(new SuscriptorDos());
		
		//Se cambia el estado - el observer notifica a los suscriptores
		oferta.setEstado(TiposDeOferta.DESCUENTO_10_OFF);
		
		oferta.setEstado(TiposDeOferta.DESCUENTO_25_OFF);
		
		oferta.setEstado(TiposDeOferta.DESCUENTO_50_OFF);		
	}

}
