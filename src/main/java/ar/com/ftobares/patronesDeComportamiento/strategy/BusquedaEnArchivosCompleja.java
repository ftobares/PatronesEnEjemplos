package ar.com.ftobares.patronesDeComportamiento.strategy;

public class BusquedaEnArchivosCompleja extends AnalisisComplejo{

	@Override
	void leerArchivos() {
		System.out.println("BusquedaEnArchivosCompleja > Leyendo los archivos");		
	}

	@Override
	void aplicarFiltros(String topic1, String topic2) {
		System.out.println("BusquedaEnArchivosCompleja > Filtrando segun topicos: "+topic1+"|"+topic2);		
	}

	@Override
	void parsearDatos() {
		System.out.println("BusquedaEnArchivosCompleja > Procesando datos");
	}

	@Override
	int escribirResultado() {
		System.out.println("BusquedaEnArchivosCompleja > Escribiendo en disco el resultado");
		return 1; //Devuelvo codigo de exito o fracaso
	}

	@Override
	void comprimirReporte(String formato) {
		System.out.println("BusquedaEnArchivosCompleja > Comprimo reporte en formato "+formato);		
	}

	@Override
	void transferirReporte(String uri) {
		System.out.println("BusquedaEnArchivosCompleja > Envio el reporte al uri "+uri);		
	}

}
