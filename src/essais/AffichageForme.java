package essais;

import formes.Forme;

public class AffichageForme {

	public static void afficher(Forme abc) {
		
		System.out.println("P�rim�tre : " + abc.calculerPerimetre() + " cm�");
		System.out.println("Surface : " + abc.calculerSurface() + " cm�");
		System.out.println("\n");
		
	}
}
