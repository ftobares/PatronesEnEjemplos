package ar.com.ftobares.patronesDeComportamiento.visitor;

public class EntrenadorConArmasVisitor extends EntrenadorVisitante{

	@Override
	public void visitandoGuerrero(Guerrero guerrero) {
		System.out.println("Entrenar a con "+guerrero.getTipoArma()+" y entrenar con escudo del tipo "+guerrero.getTipoEscudo());
	}

	@Override
	public void visitandoJinete(Jinete jinete) {
		System.out.println("Entrenar a con "+jinete.getTipoArma()+" y entrenar con caballo del tipo "+jinete.getTipoCaballo());
	}

	@Override
	public void visitandoArquero(Arquero arquero) {
		System.out.println("Entrenar a punteria con "+arquero.getTipoArco());		
	}

}
