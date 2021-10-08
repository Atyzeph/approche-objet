package entites;

public class AdressePostale {

	int numeroRue = 0;
	String libRue = "";
	int postale = 0;
	String ville = "";
	
	AdressePostale(int numeroRue, int postale, String libRue, String ville){
		this.numeroRue = numeroRue;
		this.postale = postale;
		this.libRue = libRue;
		this.ville = ville;
	}
}
