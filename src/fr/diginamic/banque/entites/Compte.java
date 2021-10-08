package fr.diginamic.banque.entites;

public class Compte {
	private int numCompte = 0;
	private double solde = 0;
	
	
	public String toString() {
		return "N° de compte : " + numCompte + "\n" + "Solde :  " + solde + " €";
	}
	
	Compte(int numCompte, int solde){
		this.numCompte = numCompte;
		this.solde = solde;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
