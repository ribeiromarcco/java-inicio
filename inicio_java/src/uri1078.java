import java.util.Scanner;

public class uri1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.printf("%d x %d = %d%n", i, num, i*num);
		}
		
		sc.close();

	}

}
