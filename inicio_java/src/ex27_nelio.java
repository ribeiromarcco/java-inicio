import java.util.Scanner;

public class ex27_nelio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		int N = sc.nextInt();
		double vet[] = new double[N];
		
		for(int i=0; i<vet.length; i++) {
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		System.out.print("VALORES = ");
		for(int i=0; i<vet.length; i++) {
			System.out.print(vet[i] + " ");
			
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + soma/vet.length);
		
		sc.close();

	}

}

