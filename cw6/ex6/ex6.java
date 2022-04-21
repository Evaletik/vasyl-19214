package cw6;

class Malarstwo {
	public String tytul;
	public String autor;
	public int rok;
	public String technika;
	public String cena;
	
	public String getTytul() {
		return tytul;
	}
	
	public String getCena() {
		return cena;
	}
}

public class ex6 {
	public static void main(String[] args) {
		Malarstwo m1 = new Malarstwo();
		m1.tytul = "Mona Lisa ~";
		m1.autor = "Leonardo da Vinci";
		m1.rok = 1507;
		m1.technika = "Olej na desce";
		m1.cena = "od 850 mln do 2,5 miliarda $";
		System.out.println(m1.getTytul() + " " + m1.getCena() + "\n" + m1.autor + " " + m1.rok + " " + m1.technika);
		System.out.println("\n");
		Malarstwo m2 = new Malarstwo();
		m2.tytul = "Czarny kwadrat na białym tle ~";
		m2.autor = "Kazimierz Malewicz";
		m2.rok = 1915;
		m2.technika = "Olej";
		m2.cena = "$140 000 000";
		System.out.println(m2.getTytul() + " " + m2.getCena() + "\n" + m2.autor + " " + m2.rok + " " + m2.technika);
	}
}
