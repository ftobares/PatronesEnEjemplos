package ar.com.ftobares.patronesDeEstructura.decorator;

public class CajaDeAhorros implements CuentaBancaria{

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		System.out.println("Se abrio la caja de ahorros para "+cuenta.getNombre());		
	}

}
