package testEnumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Season[] seasons = Season.values();
		
		for (Season i : seasons) {
			System.out.println(i.getName());
		}
		
		String name1 = "ETE";
		Season season1 = Season.valueOf(name1);
		
		System.out.println("Saison choisie : " + season1.getOrder() + " " + season1.getName());
		
		String name2 = "Hiver";
		
		// On crée une saison
		Season season2 = seasons[0];
		season2 = season2.libelle(name2);
		
		System.out.println("Saison TROUVÉE : " + season2.getOrder() + " " + season2.getName());
	}
}
