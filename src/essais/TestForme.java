package essais;

import formes.*;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forme carre = new Carre(15);
		Forme cercle = new Cercle(26);
		Forme rectangle = new Rectangle(15, 50);
		
		AffichageForme.afficher(carre);
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
	}

}
