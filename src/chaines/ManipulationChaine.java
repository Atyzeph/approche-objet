package chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println(chaine.length());
		System.out.println(chaine.indexOf('D'));
		
		
		System.out.println(chaine.substring(chaine.indexOf('D'),chaine.indexOf(';')).toUpperCase());
		System.out.println(chaine.substring(chaine.indexOf('M'),chaine.indexOf(';', 13)).toLowerCase());
		System.out.println(chaine.split(";"));
		
		String[] tab = chaine.split(";");
		
		String salaireSansEspace = tab[2].replace(" ", "");
		System.out.println(salaireSansEspace);
		
		Salarie salarie = new Salarie(tab[0], tab[1], Double.parseDouble(salaireSansEspace));
		System.out.println(salarie);
	}
}
