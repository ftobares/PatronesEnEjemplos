package ar.com.ftobares.patronesDeCreacion.factorymethod;

/**
 * Objetivo:
 * Definir una interfaz para crear objetos, pero dejar que sean las implementaciones
 * quienes determinen que clase instanciar. 
 * 
 * Esto nos da la flexibilidad de no depender de una instancia en particular.
 * Delegamos en la fabrica para instanciar la clase que necesitamos. De esta forma
 * nosotros como cliente no estamos acoplados al modelo y las instancias que pueden
 * craerse. Además podemos aumentar o disminuir las instancias que pueden fabricarse
 * sin generar una sobrecarga en modificaciones por parte del cliente. 
 * 
 * */
public class Main {
	
	public static void main(String[] args) {
		ejecutarFactoryMethod();
	}
	
	//FIXME Completar logica para que funcione
	public static void ejecutarFactoryMethod() {
		
		FabricaGestiones fabrica = new FabricaGestiones();
		Cliente cliente = new Cliente();
		
		Gestion gestionServicioTecnico = fabrica.getGestion("SERVICIO TECNICO");
		gestionServicioTecnico.generarGestion(cliente);
		gestionServicioTecnico.resolverGestion(1L);

		Gestion gestionBaja = fabrica.getGestion("BAJA CLIENTE");
		gestionBaja.generarGestion(cliente);
		gestionBaja.resolverGestion(1L);
		
		Gestion gestionDeuda = fabrica.getGestion("RECLAMO DEUDA");
		gestionDeuda.generarGestion(cliente);
		gestionDeuda.resolverGestion(1L);
		
	}

}
