package ar.com.ftobares.patronesDeComportamiento.visitor;


/**
 * FIXME Agregar explicacion
 * */
public class Main {
	
	private static final int CANT = 10;
	
	public static void main(String[] args) {
		VisitorClient visitor = new VisitorClient(CANT);
		
		visitor.entrenamientoFisico();
		visitor.entrenamientoConArmas();		
		visitor.mantenimientoDeArmas();
	}

}
