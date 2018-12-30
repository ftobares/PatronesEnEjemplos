package ar.com.ftobares.patronesDeComportamiento.visitor;

public class Jinete implements Soldado {
	
	private String nombre;
	
	private String tipoCaballo;
	
	private String tipoArma;	

	public Jinete(String tipoCaballo, String tipoArma) {
		super();
		this.tipoCaballo = tipoCaballo;
		this.tipoArma = tipoArma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoCaballo() {
		return tipoCaballo;
	}

	public void setTipoCaballo(String tipoCaballo) {
		this.tipoCaballo = tipoCaballo;
	}

	public String getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}

	@Override
	public void accept(EntrenadorVisitante visitor) {
		visitor.visitandoJinete(this);		
	}	

}
