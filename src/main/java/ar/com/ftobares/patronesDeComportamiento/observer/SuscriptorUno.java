package ar.com.ftobares.patronesDeComportamiento.observer;

public class SuscriptorUno extends OfertaObserver{

	@Override
	public void update(TiposDeOferta estado) {
		System.out.println("Al suscriptor uno se le envia mail con la oferta de "+estado.toString());		
	}

}
