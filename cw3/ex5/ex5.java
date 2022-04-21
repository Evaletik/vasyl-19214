package cw3;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		if(toAlphabetQueue(str1).equals(toAlphabetQueue(str2))) {
			System.out.println("anagrama");
		}
		else {
			System.out.println("Nie jest sa anagrama");
		}
	}
	
	public static String toAlphabetQueue(String str) {
		char chars[] = str.toCharArray();
		for(int i = 0; i < chars.length - 1; i++) {
			for(int j = 0; j < chars.length - 1; j++) {
				if(chars[j] > chars[j+1]) { 
					char temp = chars[j];
					chars[j] = chars[j + 1];
					chars[j+1] = temp;
				}
			}
		}
		
		String res = "";
		for(int k = 0; k < chars.length; k++) {
			res += chars[k];
		}
		System.out.println(res);
		return res;
	}
}