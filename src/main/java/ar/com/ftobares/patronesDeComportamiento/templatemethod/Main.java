package ar.com.ftobares.patronesDeComportamiento.templatemethod;

public class Main {
	
	public static void main(String[] args) {
		ejecutarTemplateMethod();
	}
	
	public static void ejecutarTemplateMethod() {
		Gestion gestion = new GestionBaja();
		gestion.execute();
		
		gestion = new GestionDeuda();
		gestion.execute();
		
		gestion = new GestionServicioTecnico();
		gestion.execute();
	}
	
}
