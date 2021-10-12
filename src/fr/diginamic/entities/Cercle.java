package fr.diginamic.entities;

public class Cercle {
	
	private double rayon;	
	
	public Cercle(double rayon) {
		this.rayon = rayon;
		
	}
	
	

	@Override
	public String toString() {
		return "Le rayon est de : " 
				+ rayon + " cm."
				+ "\n" 
				+ "Son périmètre est : " 
				+ perimetre() + " cm."
				+ "\n" 
				+ "Sa surface est de : " 
				+ surface() + " cm².";
	}



	public String perimetre() {
		
		double perimetre = Math.PI * (rayon * 2);
		String result = String.format("%.2f", perimetre);
		return result;
	}
	
	public String surface() {
		double surface = Math.PI * (rayon * rayon);
		String result = String.format("%.2f", surface);
		return result;
	}
	

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
