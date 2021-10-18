package tri;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville v1 = new Ville("Clermont", 1500);
		Ville v2 = new Ville("Clermont", 1500);
		
		System.out.println("equals() : " + v1.equals(v2));
		System.out.println("equalsEquals" + v1.equalsEquals(v2));
	}

}
