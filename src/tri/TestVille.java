package tri;

import java.util.ArrayList;
import java.util.Collection;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Ville> villes = new ArrayList<>(); 
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
	
		
		for (int i = 0; i < villes.size()-1; i++) {
			Ville v = villes.get(i);
			Ville v1 = villes.get(i+1);
			System.out.println(v.getNom().compareTo(v1.getNom()));
		}
		
	}
}
