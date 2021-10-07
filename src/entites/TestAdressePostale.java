package entites;

public class TestAdressePostale {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 5;
		adr1.libRue = "Rue des étangs";
		adr1.postale = 80000;
		adr1.ville = "Amiens";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 8;
		adr2.libRue = "Rue des tréfonds";
		adr2.postale = 60600;
		adr2.ville = "Clermont";
	}
}
