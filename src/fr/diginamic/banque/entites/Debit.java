package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, double montantOP) {
		super(date, montantOP);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return "Debit ";
	}
	
}
