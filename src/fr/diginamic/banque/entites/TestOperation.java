package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Credit op1 = new Credit("12/05/21", 125);
		Credit op2 = new Credit("05/08/21", 250);
		
		Debit op3 = new Debit("10/04/21", 175);
		Debit op4 = new Debit("01/02/21", 95);	
	
		Operation[] tabOp = new Operation[4];
		
		tabOp[0] = op1;
		tabOp[1] = op2;
		tabOp[2] = op3;
		tabOp[3] = op4;
		
		for (int i = 0; i < tabOp.length; i++) {
			System.out.println(tabOp[i] + "\n");
		}
	}
}
