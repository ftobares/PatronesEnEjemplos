package ar.com.ftobares.patronesDeComportamiento.visitor;

public class EntrenadorHerreroVisitor extends EntrenadorVisitante{

	@Override
	public void visitandoGuerrero(Guerrero guerrero) {
		System.out.println("Afilando espadas, hachas y sacando bollos de escudos");
	}

	@Override
	public void visitandoJinete(Jinete jinete) {
		System.out.println("Arreglando herraduras y afilando lanzas");
	}

	@Override
	public void visitandoArquero(Arquero arquero) {
		System.out.println("Reparando flechas y cambiando tanza del arco");
	}

}
