package ar.com.ftobares.patronesDeComportamiento.visitor;

public class Arquero implements Soldado {
	
	private String nombre;
	
	private String tipoArco;
	
	private int cantidadDeFlechas;	

	public Arquero(String tipoArco, int cantidadDeFlechas) {
		super();
		this.tipoArco = tipoArco;
		this.cantidadDeFlechas = cantidadDeFlechas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoArco() {
		return tipoArco;
	}

	public void setTipoArco(String tipoArco) {
		this.tipoArco = tipoArco;
	}

	public int getCantidadDeFlechas() {
		return cantidadDeFlechas;
	}

	public void setCantidadDeFlechas(int cantidadDeFlechas) {
		this.cantidadDeFlechas = cantidadDeFlechas;
	}

	@Override
	public void accept(EntrenadorVisitante visitor) {
		visitor.visitandoArquero(this);
	}	

}
