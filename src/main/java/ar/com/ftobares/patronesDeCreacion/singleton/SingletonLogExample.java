package ar.com.ftobares.patronesDeCreacion.singleton;

/**
 * Otra forma de implementar el Singleton es solo instanciando la primera vez
 * que se solicita dicha instancia, luego solo obtengo la instancia ya creada.
 * */
public class SingletonLogExample {
	
	private static SingletonLogExample instancia;
	
	private SingletonLogExample() {}
	
	public static SingletonLogExample getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLogExample();
		}
		return instancia;
	}
	
	public void log(String data) {
		System.out.println(data);
	}
	
}
