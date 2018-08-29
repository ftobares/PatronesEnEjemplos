package ar.com.ftobares.patronesDeCreacion.prototype;

/**
 * Objetivo:
 * Se obtiene un objeto a traves de una instancia prototipica. Es decir se crean
 * nuevos objetos copiando la configuracion(datos) del objeto prototipo.
 * 
 * Con esto se busca por un lado disminuir el trabajo de configuración en objetos
 * complejos, de modo de evitar cargar información a nuevas instancias repetidas veces.
 * 
 * Además se pueden crear un numero indeterminado de instancias en tiempo de ejecución
 * que tengan los mismos datos, sin necesidad de por ejemplo tenerlos persistidos o acceder
 * a ellos a una BD cada vez que se necesita una instancia nueva.
 * 
 * */
public class Main {

	//Ejemplo muy simple pero que representa un poco la idea del patron
	public void ejecutarPrototype() {	
		
		//Cuando se necesita crear una nueva cuenta invitado
		//seteo el nombre, sucursal actual y el saldo que tiene.
		//Luego para evitar tener que setear repetidamente, genero 
		//clones de este usuario y solo cambio el nombre.
		CuentaPrototype prototypeInvitado = new CuentaInvitado("Prototype","Microcentro",1000L);
		
		//Como se observa facilmente consigo copias de la instancia sin mucho trabajo
		try {
			CuentaInvitado cuentaConPerfilInvitado = (CuentaInvitado) prototypeInvitado.clonar();
			cuentaConPerfilInvitado.setNombre("Jorge");
			
			CuentaInvitado cuentaConPerfilInvitado2 = (CuentaInvitado) prototypeInvitado.clonar();
			cuentaConPerfilInvitado2.setNombre("Julieta");
		} catch (CloneNotSupportedException e) {
		      System.out.println("No se pudo generar una copia de la instancia");
		}
		
		//Obtengo el usuario de alguna BD
		CuentaPrototype prototypeUsuario = new CuentaUsuario("Carlos", "Avellaneda", 3000L, true, true, true, false);
				
		//En este caso para una cuenta de un perfil mas complejo el beneficio que se 
		//obtiene es mayor, ya que hay mucho menos que configurar en la nueva instancia
		try {
			CuentaInvitado cuentaConPerfilUsuario = (CuentaInvitado) prototypeInvitado.clonar();
			cuentaConPerfilUsuario.setNombre("Mariana");			
		} catch (CloneNotSupportedException e) {
		      System.out.println("No se pudo generar una copia de la instancia");
		}	
		
	}
	
}
