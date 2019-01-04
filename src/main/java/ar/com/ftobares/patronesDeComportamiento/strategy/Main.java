package ar.com.ftobares.patronesDeComportamiento.strategy;

public class Main {
	
	public static void main(String[] args) {
		ejecutarStrategy();
	}

	private static void ejecutarStrategy() {
		/** Se puede usar el patron Factory para obtener la instancia de la estrategia correspondiente
			segun un valor determinado por parametro
		*/
		BusquedaEnArchivosSimple beas = new BusquedaEnArchivosSimple();		
		Context ctx = new Context(beas);		
		ctx.execute(".exe");
		System.out.println(beas.getStatus());
		
		System.out.println("####################################");
		
		BusquedaEnArchivosCompleja beac = new BusquedaEnArchivosCompleja();		
		ctx.changeStrategy(beac);
		ctx.execute("pizza","restaurant","7zip","https://storage-service/files/");
	}

}
