package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
	public static void main(String args[]) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		//TODO Développements à réaliser ci-dessous
		
		mapVilles.put(55, "Lille");
		mapVilles.put(56, "Lyon");
		mapVilles.put(57, "Bordeaux");
		
		for (HashMap.Entry<Integer, String> entry : mapVilles.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key + " => " + val);
		}
	}
}