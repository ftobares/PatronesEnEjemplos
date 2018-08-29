package ar.com.ftobares.patronesDeCreacion.abstractfactory;

public class FabricaPDF implements AbstractFactory{

	@Override
	public Archivo generarArchivo() {
		Pdf file = new Pdf();
		System.out.println("Gener� el archivo Pdf");
		return file;
	}

	@Override
	public CodigoBarras generarCodigoDeBarras() {
		ImagenCB barCode = new ImagenCB();
		System.out.println("Gener� el codigo de barras tipo Imagen");
		return barCode;
	}

}
