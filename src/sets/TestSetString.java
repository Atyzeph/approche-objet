package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> pays = new HashSet<String>();
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");
		
		String maxStr = "";
		
		for (String val : pays) {
			if (val.length() > maxStr.length()) {
				maxStr = val;
			}	
		}
		System.out.println("Le plus grand pays est : " + maxStr + ". Nous allons donc supprimer ce pays.");
		pays.remove(maxStr);
		System.out.println(pays);
		
	}

}
