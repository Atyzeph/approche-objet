package entites;

public class Personne {

	// TODO Auto-generated method stub
	String nom = "";
	String prenom = "";
	AdressePostale adrPostale = null;
	
	Personne(String nom, String prenom, AdressePostale adrPostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adrPostale = adrPostale;
	}
	
	public void declarerIdentiter() {
		
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	public void modifierNomPersonne(String nouveauNom) {
        this.nom = nouveauNom;
    }
	
	public void modifierPrenomPersonne(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }
	
	public void modifierAdressePersonne(AdressePostale NouvelleAdrPostale) {
		
		this.adrPostale = NouvelleAdrPostale;
    }
	
	public String retourNom() {
		return this.nom;
	}
	
	public String retourPrenom() {
		return this.prenom;
	}
	
	public AdressePostale retourAdrPost() {
		return this.adrPostale;
	}
	
}
