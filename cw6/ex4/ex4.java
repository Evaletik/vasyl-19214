package cw6;

class Ksiazka {
	public String tytul;
	public String author;
	public String gatunek;
	
	public String[] wydanie = new String[10];

	public String[] getWydanie() {
		return wydanie;
	}
}

public class ex4 {
	public static void main(String[] args) {
		String[] wydawnictwa = new String[] {"1887","1890","1892","1893"};
		Ksiazka ks1 = new Ksiazka();
		ks1.tytul = "Sherlock Holmes";
		ks1.author = "Sir Arthur Conan Doyle";
		ks1.gatunek = "Detective";
		ks1.wydanie = wydawnictwa;
		
		System.out.println(ks1.tytul + " " + ks1.author + " " + ks1.gatunek + "\nwydawnictwa: " + ks1.wydanie.length);
		
		String[] wydawnictwa2 = new String[] {"1954","1954","1955"};
		Ksiazka ks2 = new Ksiazka();
		ks2.tytul = "The Lord of the Rings";
		ks2.author = "J. R. R. Tolkien";
		ks2.gatunek = "Fantasy";
		ks2.wydanie = wydawnictwa2;
		
		System.out.println(ks2.tytul + " " + ks2.author + " " + ks2.gatunek + "\nwydawnictwa: " + ks2.wydanie.length);
	}
}
