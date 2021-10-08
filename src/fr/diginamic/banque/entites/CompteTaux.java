package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private final double tauxRem;

	public CompteTaux(int numCompte, int solde, double tauxRem) {
		super(numCompte, solde);
		// TODO Auto-generated constructor stub
		this.tauxRem = tauxRem;
	}
	
	// @Override
	public String toString() {
		return "N° de compte : " 
				+ getNumCompte() 
				+ "\n" + "Solde : " 
				+ getSolde() 
				+ " €" 
				+ "\n" 
				+ "Taux rémunération : " 
				+ this.tauxRem
				+ "%";
	}
}
