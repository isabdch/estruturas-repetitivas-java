import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Faça um programa que leia uma temperatura em Celsius e mostre o equivalente em Fahrenheit.
		// Pergunta se o usuário deseja repetir (s/n). Caso o usuário digite "s", repita o programa.
		
		char confirmacao;
		double celsius;
		double fahrenheit;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			
			celsius = sc.nextDouble();
			
			fahrenheit = ((9 * celsius) / 5) + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			
			confirmacao = sc.next().charAt(0);
		} while (confirmacao == 's');
		
		sc.close();
	}

}
