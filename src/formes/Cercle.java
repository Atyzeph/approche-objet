package formes;

public class Cercle extends Forme {

	private double rayon;
	
	public Cercle(double rayon) {
		// TODO Auto-generated constructor stub
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.PI * (rayon * rayon);
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return Math.PI * (rayon * 2);
	}
	

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	

}
