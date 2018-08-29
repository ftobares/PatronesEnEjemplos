package ar.com.ftobares.patronesDeEstructura.decorator;

public class CuentaCorriente implements CuentaBancaria{
	
	@Override
	public void abrirCuenta(Cuenta cuenta) {
		System.out.println("Se abrio la cuenta corriente para "+cuenta.getNombre());		
	}

}
