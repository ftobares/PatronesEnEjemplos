package ar.com.ftobares.patronesDeComportamiento.observer;

public class SuscriptorDos extends OfertaObserver{

	@Override
	public void update(TiposDeOferta estado) {
		System.out.println("Al suscriptor dos se le envia mail con la oferta de "+estado.toString());		
	}

}
