package ar.com.ftobares.patronesDeComportamiento.command;

/**
 * Este seria el Command (la interfaz)
 * Es quien guarda toda la informacion requerida para ejecutar las acciones
 * Usa un metodo generico que sera sobreescrito por las implementaciones, las
 * cuales aplican la logica que corresponde
 * */
public interface Orden {

	public void execute();
	
}
