package ar.com.ftobares.patronesDeEstructura.decorator;

/**
 * Objetivo:
 * Agregar funcionalidades extras a un objeto sin cambiar su estructura, 
 * es más poder agregar dichas funcionalidades en tiempo de ejecución según las
 * necesidades del usuario.
 * 
 * Para el ejemplo de abajo, puedo agregar funcionalidades a una cuenta de ahorro
 * sin necesidad de tener que modificar la implementacion de la cuenta de ahorro 
 * que tengo actualmente o tampoco tener que generar distintas tipos de cuentas de
 * ahorro y distintos tipos de cuentas corrientes. Simplemente agrego el decorator 
 * y de este modo le agrego la funcionalidad a la cuenta que desee 
 * (sea de ahorro o cuenta corriente). 
 * */
public class Main {
	
	public static void main(String[] args) {
		
		ejecutarDecorator();
		
	}
	
	public static void ejecutarDecorator() {
		
		Cuenta c = new Cuenta("Juan");
		
		CuentaBancaria cajaAhorros = new CajaDeAhorros();
		cajaAhorros.abrirCuenta(c);
		
		Cuenta c2 = new Cuenta("Jorge");
		
		CuentaBancaria cuentaConSeguro = new SeguroDecorator(cajaAhorros);
		cuentaConSeguro.abrirCuenta(c2);		
		
	}

}
