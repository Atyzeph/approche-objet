package essais;
import salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salarie salaire1 = new Salarie("Dubois", "Michel", 2500);
		Pigiste salaire2 = new Pigiste("Fontaine", "Marie", 30, 46);
		
	
		salaire1.afficherDonnees();
		salaire2.afficherDonnees();
	}
}
