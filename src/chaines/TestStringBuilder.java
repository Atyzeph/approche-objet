package chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder builder = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		
		for (int i = 1; i <= 100_000; i++) {
			builder.append(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Temps : " + (end - debut) + " ms");
		
		// Deuxième partie
		
		long debut2 = System.currentTimeMillis();
		
		String chaine = "";
		
		for (int i = 1; i <= 100_000; i++) {
			chaine = chaine + i;
		}
		
		long end2 = System.currentTimeMillis();
		System.out.println("Temps : " + (end2 - debut2) + " ms");
	}
}
