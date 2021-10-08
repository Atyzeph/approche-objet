package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montantOP) {
		super(date, montantOP);
		// TODO Auto-generated constructor stub
		

	}
	
	public String getType() {
		return "CREDIT ";
	}
}
