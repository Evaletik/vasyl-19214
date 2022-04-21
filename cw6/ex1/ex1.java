package cw6;

class TelefonKomorkowy{
	public String model;
	public String color;
	public int memory;
	public int RAM;
	public int cena;
	
	public String memoryRAM() {
		return RAM + "/" + memory +" GB";
	}
	
	public String modelColor() {
		return model + " " + color;
	}
}

public class ex1 {
	public static void main(String[] args) {
		TelefonKomorkowy tel1 = new TelefonKomorkowy();
		tel1.model = "Iphone 13 pro max";
		tel1.color = "Sierra Blue ";
		tel1.RAM = 6;
		tel1.memory = 256;
		tel1.cena = 5999;
		
		System.out.print(tel1.modelColor());
		System.out.print(tel1.memoryRAM());
		System.out.println(" cena: " + tel1.cena + " zł");
		
		TelefonKomorkowy tel2 = new TelefonKomorkowy();
		tel2.model = "SAMSUNG Galaxy Z Fold 3";
		tel2.color = "Black ";
		tel2.RAM = 12;
		tel2.memory = 512;
		tel2.cena = 8089;
		
		System.out.print(tel2.modelColor());
		System.out.print(tel2.memoryRAM());
		System.out.println(" cena: " + tel2.cena + " zł");
	}
}
