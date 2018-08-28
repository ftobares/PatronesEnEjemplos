package ar.com.ftobares.patronesDeCreacion.factorymethod;

public class FabricaGestiones {
	
	public Gestion getGestion(String tipo) {
		
		if(tipo.equalsIgnoreCase(new String("SERVICIO TECNICO"))) {
			return new GestionServicioTecnico();
		}else if(tipo.equalsIgnoreCase(new String("BAJA CLIENTE"))) {
			return new GestionBaja();
		}else if(tipo.equalsIgnoreCase(new String("RECLAMO DEUDA"))) {
			return new GestionDeuda();
		}else {
			return null;
		}		
	}
	
}
