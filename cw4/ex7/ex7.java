import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex7 {
	public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {			
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			int[] arr = new int[N];
			
			for(int j = 0; j < N; j++) {
				int num = scanner.nextInt();
				arr[j] = num;
			}
			boolean check = checker(N, arr, K);
			if(check) {
				System.out.println("TAK");
			} else {
				System.out.println("NIE");
			}
		}
    }
    public static boolean checker(int a, int[] arr, int b) {
		if(a == b) {
			return true;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < a; i++) {
			map.put(arr[i], i);
		}

		if(map.size() > b) {
			return false;
		}

		int x = a / b;
		for(int key : map.keySet()) {
			if(map.get(key) % x != 0) {
				return false;
			}
		}
		return true;
	}
}