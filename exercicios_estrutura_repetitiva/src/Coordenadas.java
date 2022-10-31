import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.print("Informe as coordenadas X e Y para saber o quadrante as quais elas pertencem: ");

		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Estas coordenadas pertencem ao primeiro quadrante.");
			} else if (x < 0 && y > 0) {
				System.out.println("Estas coordenadas pertencem ao segundo quadrante.");
			} else if (x < 0 && y < 0) {
				System.out.println("Estas coordenadas pertencem ao terceiro quadrante.");
			} else {
				System.out.println("Estas coordenadas pertencem ao quarto quadrante.");
			}

			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

}
