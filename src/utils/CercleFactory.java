package utils;

import fr.diginamic.entities.Cercle;

public class CercleFactory {
	
	public double nouvCercle;
	
	
	@Override
	public String toString() {
		return "CercleFactory [nouvCercle=" + nouvCercle + "]";
	}


	public CercleFactory(double nouvCercle) {
		this.nouvCercle = nouvCercle;
	}


	public static Cercle CreerUnCercle(double nouvCercle) {
		
		return new Cercle(nouvCercle);
	}
	

	public double getTest() {
		return nouvCercle;
	}

	public void setTest(double nouvCercle) {
		this.nouvCercle = nouvCercle;
	}
	
	

}
