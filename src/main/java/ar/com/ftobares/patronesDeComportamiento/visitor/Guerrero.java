package ar.com.ftobares.patronesDeComportamiento.visitor;

public class Guerrero implements Soldado {
	
	private String nombre;
	
	private String tipoArma;
	
	private String tipoEscudo;	

	public Guerrero(String tipoArma, String tipoEscudo) {
		super();
		this.tipoArma = tipoArma;
		this.tipoEscudo = tipoEscudo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}

	public String getTipoEscudo() {
		return tipoEscudo;
	}

	public void setTipoEscudo(String tipoEscudo) {
		this.tipoEscudo = tipoEscudo;
	}

	@Override
	public void accept(EntrenadorVisitante visitor) {
		visitor.visitandoGuerrero(this);	
	}	

}
