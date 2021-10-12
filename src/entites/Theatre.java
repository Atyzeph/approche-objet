package entites;

public class Theatre {
	String nom = "Opéra";
	int capMax;
	double ttClit = 0;
	double recette = 0;
	
	
	public Theatre(int capMax, double ttClit) {
		super();
		this.capMax = capMax;
		this.ttClit = ttClit;
	}



	
	@Override
	public String toString() {
		return "\n" + "Theatre " + nom + "\n" + "Capacité max : " + capMax + "\n" + "Total d'inscrits : " + ttClit + "\n" + "Recette : " + recette + " €";
	}




	public void inscrire(int nbClient, int prixPlace) {
		
		if ((ttClit+nbClient) <= capMax) {
			
			ttClit++;
			recette+= ttClit * prixPlace;
			System.out.println("Nombre total de clients : " + ttClit + " inscrits." + "\n" + "Recette : " + recette + " €");
			
		}else {
			System.out.println("Erreur : Le nombre de place à été atteint (" + ttClit + ").");
		}
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNb() {
		return capMax;
	}
	public void setNb(int capMax) {
		this.capMax = capMax;
	}
	public double getTtClit() {
		return ttClit;
	}
	public void setTtClit(double ttClit) {
		this.ttClit = ttClit;
	}
	public double getRecette() {
		return recette;
	}
	public void setRecette(double recette) {
		this.recette = recette;
	}
	
}
