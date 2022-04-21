import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class ex4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int col = 2;
		int[][] calendarArr = new int[days][col];
		int day = 0;
		
		for(int i = 0; i < days; i++) {
			for(int j = 0; j < col; j++) {
				if(j == 0) {
					calendarArr[i][j] = ++day;
				} else {
					LocalDate localDate = LocalDate.of(calendar.get(Calendar.YEAR),
													   calendar.get(Calendar.MONTH) + 1,
													   calendarArr[i][0]);
					DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
					if(dayOfWeek == DayOfWeek.MONDAY) {
						calendarArr[i][1] = 4;
					} else if(dayOfWeek == DayOfWeek.TUESDAY) {
						calendarArr[i][1] = 2;
					} else if(dayOfWeek == DayOfWeek.THURSDAY) {
						calendarArr[i][1] = 3;
					} else if(dayOfWeek == DayOfWeek.FRIDAY) {
						calendarArr[i][1] = 6;
					}
				}
			}
		}
		
		for(int i = 0; i < days; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print( calendarArr[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
}