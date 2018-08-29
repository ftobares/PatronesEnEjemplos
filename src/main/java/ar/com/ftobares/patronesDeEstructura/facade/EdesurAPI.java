package ar.com.ftobares.patronesDeEstructura.facade;

public class EdesurAPI {
	
	public EdesurAPI() {
		
	}	

	public Long obtenerMontoAPagar(String fechaHasta) {
		double value = Math.random();
		
		Long importe = (value >= 0.5d) ? 1000L : 2000L;
		
		return importe;
	}

}
