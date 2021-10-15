package maps;

import java.util.HashMap;

public class CreationMap {
	public static void main(String[] args) {
		User u1 = new User("Paul", 1750);
		User u2 = new User("Hicham", 1825);
		User u3 = new User("Yu", 2250);
		User u4 = new User("Ingrind", 2015);
		User u5 = new User("Chantal", 2418);
	
		HashMap<String, User> mapSalaires = new HashMap<>();
		mapSalaires.put("paul", u1);
		mapSalaires.put("hicham", u2);
		mapSalaires.put("yu", u3);
		mapSalaires.put("ingrid", u4);
		mapSalaires.put("chantal", u5);
		
		System.out.println(mapSalaires.size());
	}
}
