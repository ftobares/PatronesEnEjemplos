package ar.com.ftobares.patronesDeEstructura.proxy;

public class CuentaProxy implements Cuenta{

	private Cuenta cuentaReal;
	
	public CuentaProxy(Cuenta cuentaReal) {
		this.cuentaReal = cuentaReal;
	}
	
	@Override
	public Long calcularComisionTransaccion(Long montoAEnviar) {
		System.out.println("Calculamos la comision del Agente y agregamos nuestra comision");
					
		//Aqui agregamos la funcionalidad extra que necesitamos pero que no podemos agregar
		//en las clases reales.
		if(cuentaReal == null) {
			//En algunos casos aqui puedo directamente indicar una implementacion que
			//desee, en vez de mostrar un "error"
			System.out.println("Debe seleccionar un agente para realizar la consulta");
			return 0L;
		}else {
			return (long) (cuentaReal.calcularComisionTransaccion(montoAEnviar) * 1.05);
		}		 
	}	
	
}
