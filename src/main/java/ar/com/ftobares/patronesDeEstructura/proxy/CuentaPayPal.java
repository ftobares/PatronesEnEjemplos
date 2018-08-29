package ar.com.ftobares.patronesDeEstructura.proxy;

public class CuentaPayPal implements Cuenta{

	@Override
	public Long calcularComisionTransaccion(Long montoAEnviar) {
		System.out.println("Calculo comision PayPal");
		return (long) (montoAEnviar * 1.2);
	}

}
