package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		// On inititalise le formatage
		SimpleDateFormat formatage = new SimpleDateFormat("dd/mm/yyyy");
		
		// On crée simplement une instance de Date
		Date date1 = new Date();
		
		// On appelle la méthode format() de l'instance qu'on stock dans une var String
		String chaine = formatage.format(date1);
		
		System.out.println(chaine);
		
		
		Date date2 = new Date(116, 04, 19, 23, 59, 30);
		
		
		System.out.println("Date modifiée : " + date2);
		
		
		SimpleDateFormat formatageSys = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dateSys = new Date();
		
		String chaineSys = formatageSys.format(dateSys);
		System.out.println("Heure système : " + chaineSys);
		
		String chaine3 = "18/10/2021 13:18:30";
		Date date3 = formatage.parse(chaine3);
	}

}
