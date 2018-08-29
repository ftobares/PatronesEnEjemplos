package ar.com.ftobares.patronesDeEstructura.decorator;

public class CuentaDecorator implements CuentaBancaria {
	
	protected CuentaBancaria cuentaDecorada;
	
	public CuentaDecorator(CuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}
	
	@Override
	public void abrirCuenta(Cuenta cuenta) {
		this.cuentaDecorada.abrirCuenta(cuenta);
	}	

}
