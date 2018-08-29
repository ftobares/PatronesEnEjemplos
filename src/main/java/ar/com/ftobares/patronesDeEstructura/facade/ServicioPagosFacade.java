package ar.com.ftobares.patronesDeEstructura.facade;

import java.util.ArrayList;
import java.util.List;

public class ServicioPagosFacade {

	public List<Servicio> buscarServiciosPorVencer(String desde, String hasta) {

		CablevisionAPI cableAPI = new CablevisionAPI();
		Long importeCable = cableAPI.getDeuda(desde, hasta);
		Servicio cable = new Servicio("Cablevision SA",importeCable);
		
		EdesurAPI edesurAPI = new EdesurAPI();
		Long importeDesdeEdesur = edesurAPI.obtenerMontoAPagar(desde);
		Long importeHastaEdesur = edesurAPI.obtenerMontoAPagar(hasta);
		Long importePeriodo = importeHastaEdesur - importeDesdeEdesur;
		Servicio edesur = new Servicio("Edesur SA",importePeriodo);
		
		List<Servicio> servicios = new ArrayList<>();
		servicios.add(cable);
		servicios.add(edesur);
		
		return servicios;
	}


}
