package fr.diginamic.banque.entites;

public abstract class Operation{
	
	protected String date;
	protected double montantOp;
	
	public String toString() {
		return date + " " + montantOp + " " + getType();
	}
	
	public abstract String getType();
	
	public Operation(String date, double montantOP){
		this.date = date;
		this.montantOp = montantOP;
		
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public double getMontantOp() {
		return montantOp;
	}


	public void setMontantOp(double montantOp) {
		this.montantOp = montantOp;
	}
	
	
}
