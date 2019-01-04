package ar.com.ftobares.patronesDeComportamiento.strategy;

public interface Strategy {
	
	<T> void analizar(T... input);

}
