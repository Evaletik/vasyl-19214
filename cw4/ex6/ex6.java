
public class ex6 {
	public static void main(String[] args) {
		int wierszy = 5;
		int col = 5;
		int arr[][] = new int [wierszy][col];
		int liczba = 0;
		int a = 10, b = 11, c = 20, d = 21;
				
		for(int i = 0; i < wierszy; i++) {
			for(int j = 0; j < col; j++) {
				if(j == 0) {
					arr[i][j] = ++liczba;
				}else if (j == 1) {
					arr[i][j] = a--;
				}else if (j == 2) {
					arr[i][j] = b++;
				}else if (j == 3) {
					arr[i][j] = c--;
				}else if (j == 4) {
					arr[i][j] = d++;
				}
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
