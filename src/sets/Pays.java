package sets;

public class Pays {

	private String nom;
	private Long nbHab;
	private double PIBhab;
	
	
	public Pays(String nom, Long nbHab, double pIBhab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		PIBhab = pIBhab;
	}	
	
	@Override
	public String toString() {
		return nom.toUpperCase() + "\n" + "Nombre d\'habitants : " + nbHab + "\n" + "PIB/habitant : " + PIBhab + "\n";
	}
	




	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getNbHab() {
		return nbHab;
	}
	public void setNbHab(Long nbHab) {
		this.nbHab = nbHab;
	}
	public double getPIBhab() {
		return PIBhab;
	}
	public void setPIBhab(double pIBhab) {
		PIBhab = pIBhab;
	}
	
	
}
