package ar.com.ftobares.patronesDeEstructura.decorator;

public class SeguroDecorator extends CuentaDecorator {
	
	public SeguroDecorator(CuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}

	@Override
	public void abrirCuenta(Cuenta cuenta) {
		cuentaDecorada.abrirCuenta(cuenta);
		seguroAgregado();
	}
	
	private void seguroAgregado() {
		System.out.println("Se agrego un seguro para la cuenta");
	}

}
