package utils;

import Operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculMoyenne test = new CalculMoyenne();
		test.ajout(5);
		test.ajout(8);
		test.ajout(10.5);
		
		System.out.println(test.calcul());

	}

}
