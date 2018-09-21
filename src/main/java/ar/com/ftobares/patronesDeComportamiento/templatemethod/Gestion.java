package ar.com.ftobares.patronesDeComportamiento.templatemethod;

public abstract class Gestion {
	
	protected abstract Long generarGestion();
	
	protected abstract Boolean procesarGestion(Long idGestion);
	
	protected abstract void cerrarGestion(Long idGestion);
	
	protected abstract void notificarSoporte(Long idGestion);
	
	
	/**
	 * Template Method
	 * */
	public final void execute() {
		
		Long idGestion = generarGestion();
		
		Boolean status = procesarGestion(idGestion);
		
		if(status) {
			cerrarGestion(idGestion);
		}else {
			notificarSoporte(idGestion);
		}
		
	}

}
