package salaire;

public abstract class Intervenant {
	
	private String nom;
	private String prenom;

	public Intervenant(String nom, String prenom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double getSalaire();


	public void afficherDonnees() {
		String statut = "";
		if (this instanceof Salarie) {
			statut = "Salarié(e)";
		}else {
			statut = "Pigiste";
		}
		System.out.println("Nom : " + nom + "\n" + "Prénom : " + prenom + "\n" + "Poste : " + statut + "\n" + "Salaire mensuel : " + getSalaire() + " €" + "\n");
	}
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
