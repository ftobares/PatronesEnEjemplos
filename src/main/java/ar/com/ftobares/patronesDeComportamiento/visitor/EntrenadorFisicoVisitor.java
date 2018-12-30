package ar.com.ftobares.patronesDeComportamiento.visitor;

public class EntrenadorFisicoVisitor extends EntrenadorVisitante {

	@Override
	public void visitandoGuerrero(Guerrero guerrero) {
		System.out.println("Entrenando guerrero en resistencia");		
	}

	@Override
	public void visitandoJinete(Jinete jinete) {
		System.out.println("Entrenando jinete en equilibrio");	
	}

	@Override
	public void visitandoArquero(Arquero arquero) {
		System.out.println("Entrenando arquero en fuerza con brazos");	
	}

}
