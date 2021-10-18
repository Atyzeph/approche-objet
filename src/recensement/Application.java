package recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		Path pathFile = Paths.get("C:\\Users\\Clément\\Downloads\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		
		String codeReg[] = new String[lines.size()];
		String nomReg[] = new String[lines.size()];
		
		String codeDep[] = new String[lines.size()];
		String codeCom[] = new String[lines.size()];
		
		String nomCom[] = new String[lines.size()];
		
		String popTT[] = new String[lines.size()];
		
		for (int i = 0; i < lines.size(); i++) {
			
			if (i == 0) {
				continue;
			}
			String line = lines.get(i);
			String tab[] = line.split(";");
			
			codeReg[i] = tab[0];
			nomReg[i] = tab[1];
			codeDep[i] = tab[2];
			codeCom[i] = tab[5];
			nomCom[i] = tab[6];
			popTT[i] = tab[7];
			
			Ville ville = new Ville(codeReg[i], nomReg[i], codeDep[i], codeCom[i], nomCom[i], popTT[i]);
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
			if (i.getCodeDep().equals("34")) {
				nbHab += Integer.parseInt(i.getPopTT().replace(" ", ""));
			}
		}
		System.out.println(nbHab + " Habitants");
		
		System.out.println("\n" + "-------------------------------" + "\n");
		
//		La plus petite ville (en cours ...)
		double minHab = nbHab;
		String plusPetite = "";
		for (Ville i : villes) {
			if (i.getCodeDep().equals("34") && Integer.parseInt(i.getPopTT().replace(" ", "")) <= minHab) {
//				nbHab = Integer.parseInt(i.getPopTT().replace(" ", ""));
				plusPetite = i.getNomCom();
			}
		}
		
		System.out.println("La plus petite ville est : " + plusPetite);
	}
}
