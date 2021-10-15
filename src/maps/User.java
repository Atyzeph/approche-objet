package maps;

public class User {
	
	private String prenom;
	private double salaire;
	
	public User(String prenom, double salaire) {
		super();
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
}
