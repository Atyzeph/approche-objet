package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 5;
		adr1.libRue = "Rue des étangs";
		adr1.postale = 80000;
		adr1.ville = "Amiens";
		
		Personne pers1 = new Personne();
		pers1.nom = "Dujardin";
		pers1.prenom = "Marco";
		pers1.adrPostale = adr1;
		
		Personne pers2 = new Personne();
	}

}
