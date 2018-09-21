package ar.com.ftobares.patronesDeComportamiento.templatemethod;

public class GestionDeuda extends Gestion{

	@Override
	public Long generarGestion() {
		Long gestion = Math.round(Math.random() * 100);
		System.out.println("Genero Gestion tipo Deuda id="+gestion);
		return gestion;
	}

	@Override
	public Boolean procesarGestion(Long idGestion) {
		System.out.println("Proceso la gestion "+idGestion);
		return (Math.random() > 0.5d);
	}

	@Override
	public void cerrarGestion(Long idGestion) {
		System.out.println("Cierro la gestion "+idGestion);
	}

	@Override
	public void notificarSoporte(Long idGestion) {
		System.out.println("Notifico por error en la gestion "+idGestion);
	}

}
