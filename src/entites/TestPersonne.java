package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adr1 = new AdressePostale(5, 60600, "Rue mar�chale", "Clermont");
		AdressePostale adr2 = new AdressePostale(10, 60140, "Rue de la paix", "Beauvais");
		
		Personne pers1 = new Personne("Martin", "Mathilde", adr1);
		pers1.declarerIdentiter();
		
		Personne pers2 = new Personne("Collin", "Cl�ment", adr2);
		pers2.modifierAdressePersonne(adr1);
	}

}
