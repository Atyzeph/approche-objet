package essais;

import formes.Forme;

public class AffichageForme {

	public static void afficher(Forme abc) {
		
		System.out.println("Périmètre : " + abc.calculerPerimetre() + " cm²");
		System.out.println("Surface : " + abc.calculerSurface() + " cm²");
		System.out.println("\n");
		
	}
}
