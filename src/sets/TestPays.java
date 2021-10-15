package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pays USA = new Pays("USA", 100_000_000L, 1800);
		Pays France = new Pays("France", 70_000_000L, 1600);
		Pays Allemagne = new Pays("Allemagne", 80_000_000L, 1450);
		Pays UK = new Pays("UK", 50_000_000L, 1200);
		Pays Italie = new Pays("Italie", 66_500_000L, 1358);
		Pays Japon = new Pays("Japon", 90_5482_560L, 1854);
		Pays Chine = new Pays("Chine", 1_500_000_000L, 1900);
		Pays Russie = new Pays("Russie", 100_500_000L, 1400);
		Pays Inde = new Pays("Inde", 50_885_418L, 800);
		
		HashSet<Pays> pays = new HashSet<Pays>();
		pays.add(USA);
		pays.add(France);
		pays.add(Allemagne);
		pays.add(UK);
		pays.add(Italie);
		pays.add(Japon);
		pays.add(Chine);
		pays.add(Russie);
		pays.add(Inde);
		
		for (Pays val : pays) {
			System.out.println(val);
		}
		
		
	}

}
