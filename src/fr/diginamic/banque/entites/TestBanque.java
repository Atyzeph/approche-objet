package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte cpt1 = new Compte(5425, 1500);
		
		CompteTaux cpt2 = new CompteTaux(8256, 5250, 0.5);
		
		System.out.println(cpt1);
		System.out.println("\n");
		
		Compte[] tabCompte = new Compte[2];
		
		tabCompte[0] = cpt1;
		tabCompte[1] = cpt2;
		
		for (int i = 0; i < tabCompte.length; i++) {
			System.out.println(tabCompte[i] + "\n");
		}
	}

}
