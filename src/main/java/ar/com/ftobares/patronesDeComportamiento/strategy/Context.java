package ar.com.ftobares.patronesDeComportamiento.strategy;

public class Context {
	
	private Strategy estrategia;
	
	public Context (Strategy strategy) {
		this.estrategia = strategy;
	}
	
	public void changeStrategy(Strategy strategy) {
		this.estrategia = strategy;
	}
	
	public <T> void execute(T... input) {
		this.estrategia.analizar(input);
	}

}
