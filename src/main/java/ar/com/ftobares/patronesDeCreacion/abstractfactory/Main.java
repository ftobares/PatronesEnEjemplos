package ar.com.ftobares.patronesDeCreacion.abstractfactory;

/**
 * Objetivo:
 * 
 * Tener una fabrica de fabricas. Es decir, tener una interfaz que te permite
 * crear familias de objetos relacionados, sin necesidad de especificar las
 * clases concretas.
 * 
 * Esto se puede hacer de dos formas. Una como esta ejemplificada aca.
 * Una interfaz que te permite crear archivos de 3 formatos distintos, utilizando 
 * cada uno una fabrica especifica. Cada fabrica a su vez usa 2 interfaces y según
 * la fabrica determina que clases concretas deben instanciarse.
 * 
 * Otra forma, es generar fabricas que no necesariamente tienen relacion entre si. 
 * Pero nos permiten la flexibilidad de ser un punto en comun para obtener familias
 * de objetos. Es decir, tener una interfaz que tiene 1 a N fabricas, y cada una de
 * puede no estar relacionada (una fabrica de conexiones a base de datos, una fabrica
 * de conexion Rest, una fabrica de generacion de gestiones, etc).
 * La unica desventaja aqui es que al no estar relacionadas las fabricas, hay metodos
 * que hay que implementar obligatoriamente pero que no tendran logica desarrollada.
 * 
 * 
 * */
public class Main {
	
	public static void main(String[] args) {
		ejecutarAbstractFactory(Tipo.EXCEL.toString());
	}
	
	public enum Tipo {
		CSV, EXCEL, PDF;
	}
	
	public static AbstractFactory ejecutarAbstractFactory(String type) {
		
		if(type.equalsIgnoreCase(Tipo.CSV.toString())) {
			return new FabricaCSV();
		}else if(type.equalsIgnoreCase(Tipo.EXCEL.toString())) {
			return new FabricaExcel();
		}else if(type.equalsIgnoreCase(Tipo.PDF.toString())) {
			return new FabricaPDF();
		}else {
			throw new IllegalArgumentException("Tipo de archivo invalido");
		}
		
	}

}
