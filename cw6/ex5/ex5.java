package cw6;

class Pieczywo {
	public String nazwa;
	public double waga;
	public String skladniki;
	
	public String getNazwa() {
		return nazwa;
	}
}

public class ex5 {
	public static void main(String[] args) {
		Pieczywo pie1 = new Pieczywo();
		pie1.nazwa = "Domowy chleb";
		pie1.waga = 550;
		pie1.skladniki = "maka pszenna, cieple mleko, sol, cukier, drozdze, 1 jajko";
		System.out.println(pie1.getNazwa() + " - " + pie1.waga + " g" + "\n" + pie1.skladniki);
		System.out.println("\n");
		Pieczywo pie2 = new Pieczywo();
		pie2.nazwa = "Chleb owocowy";
		pie2.waga = 1050;
		pie2.skladniki = "200g mąki pszennej pełnoziarnistej\r\n"
				+ "2 płaskie łyżeczki proszku do pieczenia\r\n"
				+ "4 jajka\r\n"
				+ "2 łyżeczki cynamonu\r\n"
				+ "150g płynnego miodu\r\n"
				+ "150g orzechów laskowych\r\n"
				+ "150g daktyli suszonych, bez pestek\r\n"
				+ "150g fig suszonych\r\n"
				+ "150g rodzynek\r\n"
				+ "100g kandyzowanej skórki cytrynowej\r\n"
				+ "1 łyżka rumu (opcjonalnie)\r\n"
				+ "przyprawa do piernika (opcjonalnie)";
		
		System.out.println(pie2.getNazwa() + " - " + pie2.waga + " g" + "\n" + pie2.skladniki);
	}
}
