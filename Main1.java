import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N[] = new int[10];

		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N.length - 1; j++) {
				if (N[j] > N[i]) {
					int temp = N[j];
					N[j] = N[i];
					N[i] = temp;
				}
			}

		}
		System.out.println(N[0]);

	}

}
