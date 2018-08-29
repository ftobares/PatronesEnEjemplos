package ar.com.ftobares.patronesDeCreacion.abstractfactory;

public class FabricaCSV implements AbstractFactory{

	@Override
	public Archivo generarArchivo() {
		Csv file = new Csv();
		System.out.println("Gener� el archivo CSV");
		return file;
	}

	@Override
	public CodigoBarras generarCodigoDeBarras() {
		TextoCB barCode = new TextoCB();
		System.out.println("Gener� el codigo de barras tipo String");
		return barCode;
	}
	
}
