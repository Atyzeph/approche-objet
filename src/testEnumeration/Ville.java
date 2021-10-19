package testEnumeration;

public class Ville implements Comparable<Ville> {

	String nom;
	int nbHab;
	Continent continent;
	
	public Ville(String nom, int nbHab, Continent continent) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		else {
			Ville other = (Ville) obj;
			// La valeur de retour est une valeur booleenne comme attendu dans la definition de la méthode
			return nom.equals(other.getNom()) && nbHab == other.getNbHab();
		}
	}
	
	
	public boolean equalsEquals(Ville obj) {
		if (!(obj.getNom() == nom && obj.getNbHab() == nbHab)) {
			return false;
		}
		else {
			return true;
		}
	}
	
		
	@Override
	public String toString() {
		return "Ville : " + nom + " Nombre d\'habitants" + nbHab + "\n" + "Continent : " + continent;
	}
	
	interface Comparable<T>{
		String compareTo(T o);
	}
	
	public int CompareTo(Ville o) {
		int resultat = this.getNom().compareTo(getNom());
		if (resultat > 0) {
			return 1;
		}
		if (resultat < 0) {
			return -1;
		}
		return 0;
	}
	

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbHab() {
		return nbHab;
	}
	
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
