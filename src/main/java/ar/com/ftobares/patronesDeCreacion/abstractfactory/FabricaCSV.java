package ar.com.ftobares.patronesDeCreacion.abstractfactory;

public class FabricaCSV implements AbstractFactory{

	@Override
	public Archivo generarArchivo() {
		Csv file = new Csv();
		System.out.println("Generé el archivo CSV");
		return file;
	}

	@Override
	public CodigoBarras generarCodigoDeBarras() {
		TextoCB barCode = new TextoCB();
		System.out.println("Generé el codigo de barras tipo String");
		return barCode;
	}
	
}
