package ar.com.ftobares.patronesDeComportamiento.strategy;

public abstract class AnalisisComplejo implements Strategy {
	
	private int status;
	
	public <T> void analizar(T... input) {		
		leerArchivos();
		aplicarFiltros(input[0].toString(), input[1].toString());
		parsearDatos();
		this.status = escribirResultado();
		comprimirReporte(input[2].toString());
		transferirReporte(input[3].toString());		
	}	
	
	abstract void leerArchivos();
	
	abstract void aplicarFiltros(String topic1, String topic2);
	
	abstract void parsearDatos();
	
	abstract int escribirResultado();
	
	abstract void comprimirReporte(String formato);
	
	abstract void transferirReporte(String uri);
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
