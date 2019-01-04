package ar.com.ftobares.patronesDeComportamiento.strategy;

public class BusquedaEnArchivosSimple extends AnalisisSimple{

	@Override
	void excluirArchivos(String tipoArchivo) {
		System.out.println("BusquedaEnArchivosSimple > Excluyo del analisis los archivos del formato "+tipoArchivo);
	}

	@Override
	void leerArchivos() {
		System.out.println("BusquedaEnArchivosSimple > Leyendo los archivos");
	}

	@Override
	void parsearDatos() {
		System.out.println("BusquedaEnArchivosSimple > Procesando datos");
	}

	@Override
	int escribirResultado() {
		System.out.println("BusquedaEnArchivosSimple > Escribo resultado en disco");
		return 1; //Devuelvo codigo de exito o fracaso
	}
	
}
