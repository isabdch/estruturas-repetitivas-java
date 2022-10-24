import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int soma = 0;
		
		System.out.println("Informe números inteiros que não sejam 0 para ver a soma deles no final:");
		
		numero = sc.nextInt();

		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}

		System.out.print("A soma dos números lidos é " + soma + ".");

		sc.close();
	}

}
