package ar.com.ftobares.patronesDeCreacion.abstractfactory;

public class FabricaExcel implements AbstractFactory{

	@Override
	public Archivo generarArchivo() {
		Excel file = new Excel();
		System.out.println("Gener� el archivo Excel");
		return file;
	}

	@Override
	public CodigoBarras generarCodigoDeBarras() {
		WebCB barCode = new WebCB();
		System.out.println("Gener� el codigo de barras tipo URL");
		return barCode;
	}

}
