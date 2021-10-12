package maison;

public abstract class Piece {

	private double superficie;
	private int etage = 0;
	
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}
	
	

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}
}
