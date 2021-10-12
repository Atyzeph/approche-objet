package essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre inscrit = new Theatre(5, 0);
		inscrit.inscrire(1, 10);
		inscrit.inscrire(1, 10);
		inscrit.inscrire(1, 10);
		inscrit.inscrire(1, 10);
		inscrit.inscrire(1, 10);
		inscrit.inscrire(1, 10);
		
		System.out.println(inscrit);
	}

}
