package cw6;

class filmy{
	public String title;
	public String country;
	public int year;
	public double ratings;
	public String budget;
	
	public String countryYear() {
		return country + " / " + year;
	}
	
	public String ratingsBudget() {
		return ratings + " / " + "$" +budget ;
	}
	
	public String getTitle(){
		return title;
	}
}

public class ex3 {
	public static void main(String[] args) {
		filmy movie1 = new filmy();
		movie1.title = "Harry Potter and the Goblet of Fire";
		movie1.year = 2005;
		movie1.country = "UK,USA";
		movie1.ratings = 7.9;
		movie1.budget = "150 000 000";
		
		System.out.println("Title: " + movie1.getTitle());
		System.out.println("Country / Year: " + movie1.countryYear());
		System.out.println("Ratings / Budget: " + movie1.ratingsBudget());
		
		System.out.println();
		
		filmy movie2 = new filmy();
		movie2.title = "Forrest Gump";
		movie2.year = 1994;
		movie2.country = "USA";
		movie2.ratings = 8.9;
		movie2.budget = "55 000 000";
		
		System.out.println("Title: " + movie2.getTitle());
		System.out.println("Country / Year: " + movie2.countryYear());
		System.out.println("Ratings / Budget: " + movie2.ratingsBudget());

	}
}