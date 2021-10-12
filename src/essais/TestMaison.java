package essais;
import maison.*;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piece[] pieces = new Piece[0];
		Maison maison1 = new Maison(pieces);
		
		System.out.println(maison1.calculSuperficie());
		Piece salon1 = new Salon(35, 0);
		Piece salon2 = new Salon(50, 1);
		
		maison1.ajouterPiece(salon1);
		maison1.ajouterPiece(salon2);
		
		System.out.println(maison1.calculSuperficie());
//		System.out.println(maison1.calculSuperficieParEtage(salon2));
	}

}
