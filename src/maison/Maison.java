package maison;
import java.util.*;

public class Maison {
	
	private Piece[] pieces;
	
	public Maison(Piece[] pieces) {
		super();
		this.pieces = pieces;
	}
	

	public void ajouterPiece(Piece piece) {
		pieces = Arrays.copyOf(pieces, pieces.length+1);
        pieces[pieces.length-1] = piece;
	}
	
	public double calculSuperficie() {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			superficie += pieces[i].getSuperficie();
		}
		return superficie;
	}
	
	public double calculSuperficieParEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getEtage() == etage) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}
	

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}
	
	
}
