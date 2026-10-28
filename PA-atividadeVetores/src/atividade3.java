import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Digite o "+ (i + 1)+" o valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			b[i] = a[TAM - 1 - i];
		}
		
		System.out.println("Os valores dos vetores invertidos Vetor B:");
		for(i = 0; i < TAM; i++) {
			
			System.out.print("b = " + b[i]);
			
		}
		
		
	}
}