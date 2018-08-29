package ar.com.ftobares.patronesDeCreacion.prototype;

public abstract class CuentaPrototype implements Cloneable{

	public abstract Object clonar() throws CloneNotSupportedException;
	
}
