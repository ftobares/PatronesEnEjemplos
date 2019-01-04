package ar.com.ftobares.patronesDeComportamiento.strategy;

public abstract class AnalisisSimple implements Strategy{
	
	private int status;
	
	public <T> void analizar(T... input) {
		excluirArchivos(input[0].toString());
		leerArchivos();
		parsearDatos();
		this.status = escribirResultado();
	}

	abstract void excluirArchivos(String tipoArchivo);
	
	abstract void leerArchivos();
	
	abstract void parsearDatos();
	
	abstract int escribirResultado();

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
