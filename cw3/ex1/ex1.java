import java.util.Calendar;
import java.util.Formatter;

public class ex1 {
	public static void main(String[] args) {
		Formatter dane = new Formatter();
		Calendar today = Calendar.getInstance();
		dane.format("Dzien: %1$td \n", today);
		dane.format("Miesiac: %1$tB \n" , today);
		dane.format("Rok: %1$tY \n" , today);
		dane.format("Godzina: %1$tR \n" , today);
		System.out.println(dane);
		
	}
}
