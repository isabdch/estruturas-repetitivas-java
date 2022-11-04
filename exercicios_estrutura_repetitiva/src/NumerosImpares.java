import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int impar = 0;

		if (num >= 1 && num <= 1000) {
			for (int i = 0; i < num; i++) {
				impar += 1;

				if (impar % 2 != 0) {
					System.out.println(impar);
				}
			}
		} else {
			System.out.print("Número inválido.");
		}

		sc.close();
	}

}
