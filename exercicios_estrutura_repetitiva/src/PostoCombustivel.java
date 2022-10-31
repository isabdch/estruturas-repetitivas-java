import java.util.Scanner;

public class PostoCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipoCombustivel, somaAlcool = 0, somaGasolina = 0, somaDiesel = 0;

		System.out.println(
				"Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva\n"
						+ "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel\n"
						+ "4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).");

		tipoCombustivel = sc.nextInt();

		while (tipoCombustivel != 4) {
			if (tipoCombustivel == 1) {
				somaAlcool += 1;
			} else if (tipoCombustivel == 2) {
				somaGasolina += 1;
			} else if (tipoCombustivel == 3) {
				somaDiesel += 1;
			} else {
				System.out.println("Código inválido. Tente novamente.");
			}

			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Diesel: " + somaDiesel);

		sc.close();
	}

}
