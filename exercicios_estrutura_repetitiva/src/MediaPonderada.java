import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		// seguir. Cada caso de teste consiste
		// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
		// ponderada para cada um destes
		// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
		// valor tem peso 3 e o terceiro valor tem
		// peso 5.

		int index = sc.nextInt();
		double mediaPonderada;

		for (int i = 0; i < index; i++) {
			double valor_1 = sc.nextDouble();
			double valor_2 = sc.nextDouble();
			double valor_3 = sc.nextDouble();

			mediaPonderada = ((valor_1 * 2) + (valor_2 * 3) + (valor_3 * 5)) / (2 + 3 + 5);

			System.out.printf("%.1f%n", mediaPonderada);
		}

		sc.close();
	}

}
