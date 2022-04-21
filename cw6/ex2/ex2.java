package cw6;

class ubrania{
	public String material;
	public String color;
	public String clothesType;
	public int EUsize;
	public int price;
	
	public String clothesTypeCOLOR() {
		return clothesType + " / " + color;
	}
	
	public String sizeMaterial() {
		return material + " / " + EUsize;
	}
}

public class ex2 {
	public static void main(String[] args) {
		ubrania ubr1 = new ubrania();
		ubr1.material = "cotton";
		ubr1.color = "white";
		ubr1.clothesType = "t-shirt";
		ubr1.EUsize = 48;
		ubr1.price = 100;
		
		System.out.println(" Clothes Type / color: " + ubr1.clothesTypeCOLOR());
		System.out.println(" Material / size EU: " + ubr1.sizeMaterial());
		System.out.println(" price: " + ubr1.price + " zł");
		
		System.out.println();
		
		ubrania ubr2 = new ubrania();
		ubr2.material = "genuine leather";
		ubr2.color = "white";
		ubr2.clothesType = "sneakers";
		ubr2.EUsize = 42;
		ubr2.price = 450;
		
		System.out.println(" Clothes Type / color: " + ubr2.clothesTypeCOLOR());
		System.out.println(" Material / size EU: " + ubr2.sizeMaterial());
		System.out.println(" price: " + ubr2.price + " zł");
	}
}
