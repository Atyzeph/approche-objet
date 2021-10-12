package salaire;

public class Pigiste extends Intervenant {

	private int nbJTrav;
	private double salaireJ;
	
	public Pigiste(String nom, String prenom, int nbJTrav, double salaireJ) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
		this.nbJTrav = nbJTrav;
		this.salaireJ = salaireJ;
	}
	
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJTrav * salaireJ;
	}
	
}
