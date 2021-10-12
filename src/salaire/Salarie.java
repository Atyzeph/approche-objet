package salaire;

public class Salarie extends Intervenant {

	private double salaireMens;
	
	public Salarie(String nom, String prenom, double salaireMens) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
		this.salaireMens = salaireMens;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMens;
	}
	
	

	public double getSalaireMens() {
		return salaireMens;
	}

	public void setSalaireMens(double salaireMens) {
		this.salaireMens = salaireMens;
	}
	
	

}
