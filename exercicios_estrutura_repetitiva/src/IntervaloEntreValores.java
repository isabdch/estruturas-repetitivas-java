import java.util.Scanner;

public class IntervaloEntreValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		// que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
		// estão fora do intervalo, mostrando
		// essas informações conforme exemplo (use a palavra "in" para dentro do
		// intervalo, e "out" para fora do intervalo).

		int index = sc.nextInt();
		int numero;
		int somaIn = 0;
		int somaOut = 0;

		for (int i = 0; i < index; i++) {
			numero = sc.nextInt();

			if (numero >= 10 && numero <= 20) {
				somaIn++;
			} else {
				somaOut++;
			}
		}
		
		System.out.printf("%d in%n%d out", somaIn, somaOut);

		sc.close();
	}

}
