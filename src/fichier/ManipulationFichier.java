package fichier;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path pathFile = Paths.get("C:\\Users\\Clément\\Downloads\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		List<String> listD = new ArrayList<String>();
		
//		double habs = lines.subList(lines.indexOf(lines), 0);
		
		Path pathD = Paths.get("C:\\Users\\Clément\\Downloads\\grandesVilles.csv");
		for (int i = 1; i < lines.size(); i++) {
			// On récupère les lignes une par une dans line
			String line = lines.get(i);
			String[] tab = line.split(";");
			
			int pop = Integer.parseInt(tab[tab.length-1].replaceAll(" ", ""));
			String nomV = tab[6];
			int postale = Integer.parseInt(tab[0]);
			String newLine = nomV + ";" + postale + ";" + pop;
			
			
			if (pop > 25000) {
				System.out.println(line);
				listD.add(newLine);
			}
		}
		Files.write(pathD, listD);
	}

}
