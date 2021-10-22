package recensement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.naming.ldap.SortControl;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		Path pathFile = Paths.get("C:\\Users\\Clément\\Downloads\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		for (int i = 0; i < lines.size(); i++) {
			
			if (i == 0) {
				continue;
			}
			String line = lines.get(i);
			String tab[] = line.split(";");
			
			String codeReg = tab[0];
			String nomReg = tab[1];
			String codeDep = tab[2];
			String codeCom = tab[5];
			String nomCom = tab[6];
			int popTT = Integer.parseInt(tab[9].replace(" ", "").trim());
			
			Ville ville = new Ville(codeReg, nomReg, codeDep, codeCom, nomCom, popTT);
			villes.add(ville);
		}
		
		System.out.println("Nombre de ville ajoutées : " + villes.size());
		System.out.println("\n" + "-------------------------------" + "\n");
		
		for (Ville i : villes) {
			if (i.getNomCom().equals("Montpellier")) {
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("\n" + "-------------------------------" + "\n");
		
		int nbHab = 0;
		for (Ville i : villes) {
			// On recherche le code département de L'Hérault (aussi possible avec la méthode "getNomReg()")
			if (i.getCodeDep().equals("34")) {
				nbHab += i.getPopTT();
			}
		}
		System.out.println("Nombre d'habitants dans la région de l'Hérault : " + nbHab + " Habitants");
		
		System.out.println("\n" + "-------------------------------" + "\n");
		
//		La plus petite ville
		ArrayList<Ville> herault = new ArrayList<Ville>();
		double minHab = nbHab;
		String plusPetite = "";
		
		for (Ville i : villes) {
			if (i.getCodeDep().equals("34")) {
				herault.add(i);
				
				if (i.getPopTT() < minHab) {
					minHab = i.getPopTT();
					plusPetite = i.getNomCom();
				}
			}
		}
		
		System.out.println("La plus petite ville de l'Hérault est : " + plusPetite);
		
		System.out.println("\n" + "-------------------------------" + "\n");
		// Les 10 plus petites villes et les 10 plus grandes villes
		// Les plus petites
		Collections.sort(herault);
		System.out.println("La plus petite ville de l'Hérault est : \n");
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(herault.get(i).getNomCom());
		}
		
		System.out.println("\n" + "-------------------------------" + "\n");
		// Les plus grandes
		Collections.sort(herault, Collections.reverseOrder());
		System.out.println("La plus grande ville de l'Hérault est : \n");
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(herault.get(i).getNomCom());
		}
		System.out.println("\n" + "-------------------------------" + "\n");
		
		// Afficher popultation d'Occitanie
		int popOccitanie = 0;
		ArrayList<Ville> occitanie = new ArrayList<Ville>();
		for (Ville i : villes) {
			if (i.getNomReg().equals("Occitanie")) {
				popOccitanie += i.getPopTT();
				occitanie.add(i);
			}
		}
		System.out.println("La population totale d'Occitanie est : " + popOccitanie);
		
		System.out.println("\n" + "-------------------------------" + "\n");
		
		// Afficher ville importante d'Occitanie ...
		System.out.println("Les villes les plus importantes d'Occitanie sont : \n");
		Collections.sort(occitanie, Collections.reverseOrder());

		for (int i = 0; i < 10; i++) {
			System.out.println(occitanie.get(i).getNomCom());
		}
		
		// Afficher département le plus peuplé d'Occitanie

        Map<String, Integer> occitanie1 = new HashMap<>();
        for (Ville ville : occitanie) {
            if (occitanie1.containsKey(ville.getCodeDep())) {
                occitanie1.get(ville.getCodeDep());
            } else {
                occitanie1.put(ville.getCodeDep(), ville.getPopTT());
            }
        }
        System.out.println("\n" + occitanie1.entrySet());
	}
}
