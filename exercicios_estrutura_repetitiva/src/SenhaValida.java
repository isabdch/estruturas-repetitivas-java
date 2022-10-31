import java.util.Scanner;

public class SenhaValida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.print("Digite uma senha: ");

		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha incorreta!");
			
			senha = sc.nextInt();
		}
		
		System.out.print("Senha correta!");

		sc.close();
	}

}
