package ar.com.ftobares.patronesDeComportamiento.command;

/**
 * Esta seria una de las implementaciones del Command
 * Sobreescribe el metodo a ejecutar con la logica que corresponde. Define un reciver
 * abstracto, quien sera concretamente quien realice la accion
 * */
public class ComprarStock implements Orden{
	
	private Stock abstractStock;
	
	public ComprarStock(Stock stock) {
		this.abstractStock = stock;
	}

	@Override
	public void execute() {
		this.abstractStock.comprar();
	}

}
