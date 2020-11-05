import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c[][] = new char[3][5];
		
		for(int i=0; i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]= sc.next().charAt(0);
			}
		}
		sc.close();
		for(int i=0; i<c.length;i++) {
		
			for(int j=0;j<c[i].length;j++) {
				System.out.print((char)(c[i][j]+32)+" ");
			}
			System.out.println();
		}

	}

}
