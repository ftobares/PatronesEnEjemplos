package ar.com.ftobares.patronesDeCreacion.singleton;

/**
 * <p>
 * <b>Objetivo:</b><br>
 * Tener una única instancia de la clase para toda la aplicación.<br>
 * 
 * Se aplica a clases cuya información no suele cambiar. O que tener
 * más de una instancia de la misma no genera un beneficio o no tiene un
 * sentido claro.<br>
 * De esta forma se prentende que al momento de requerir una instancia
 * de la clase, no sea necesario genera una instancia nueva sino que 
 * sea el mismo objeto (ya instanciado previamente) que es utilizado
 * por quienes lo requieren.</p>
 * 
 * <p>
 * <b>Usos tipicos:</b><br>
 * a) Un file manager<br>
 * b) Una clase de logging<br>
 * c) Conexión a base de datos
 * </p>
 * */
public final class Singleton {

	private Singleton() {}
	
	private static final Singleton instancia = new Singleton();
	
	public static Singleton getInstance() {
		return instancia;
	}
}
