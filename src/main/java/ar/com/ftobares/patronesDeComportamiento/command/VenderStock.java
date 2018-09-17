package ar.com.ftobares.patronesDeComportamiento.command;

/**
 * Esta seria una de las implementaciones del Command
 * Sobreescribe el metodo a ejecutar con la logica que corresponde. Define un reciver
 * abstracto, quien sera concretamente quien realice la accion
 * */
public class VenderStock implements Orden{
	
	private Stock abstractStock;
	
	public VenderStock(Stock stock) {
		this.abstractStock = stock;
	}

	@Override
	public void execute() {
		this.abstractStock.vender();
	}

}
