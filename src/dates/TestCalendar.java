package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 04, 19, 23, 59, 30);
		
		
		Date time = cal.getTime();
		String date = formatage.format(time);
		
		System.out.println(date);
		
		// Afficher date locale FR, UK
		
		SimpleDateFormat formatFR = new SimpleDateFormat("EEEE dd MMMM HH:mm:ss", Locale.FRANCE);
		Locale russie = new Locale("ru", "RU");
		SimpleDateFormat formatUK = new SimpleDateFormat("EEEE dd MMMM HH:mm:ss", russie);

		Date dateLocal = new Date();
		
		String dateFR = formatFR.format(dateLocal);
		System.out.println(dateFR);
		
		String dateUK = formatUK.format(dateLocal);
		System.out.println(dateUK);
	}

}
