package ar.com.ftobares.patronesDeComportamiento.command;

/**
 * Esta seria el receiver. Es quien realiza la accion concretamente
 * */
public class Stock {

	private String itemName;
	
	private int cantidad;	

	public Stock(String itemName, int cantidad) {
		this.itemName = itemName;
		this.cantidad = cantidad;
	}
	
	//Aca realiza la logica para vender stock
	public void vender() {
		System.out.println("Vender "+cantidad+" de "+itemName);
	}
	
	//Aca realiza la logica para comprar stock
	public void comprar() {
		System.out.println("Comprar "+cantidad+" de "+itemName);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
