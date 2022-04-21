package cw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("tablice liczbEX2.txt");
		try (Scanner scanner = new Scanner(file)) {
			int rows = 0;
			int columns = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				columns = line.split(" ").length;
				rows += 1;
			}
			scanner.reset();
			
			Scanner scanner2 = new Scanner(file);
			int[][] arr = new int[rows][columns];
			int a=0;
			int b=0;
			while (scanner2.hasNextLine()) {
				String line = scanner2.nextLine();
				String[] arrLine = line.split(" ");
				
				for(String str : arrLine) {
					int num = Integer.valueOf(str);
					arr[b][a] = num;
					a++;
					if(a == 5) {
						a = 0;
					}
				}
				b++;
				
			}
			scanner2.close();
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < columns; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.print("\n");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
