import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numeros[] = new int[7];

		// El siguiente bucle for llena el arreglo con los datos que digite el usuario
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Digite el numero de la posicion " + i);
			numeros[i] = scanner.nextInt();

		}

		// El siguiente bucle for imprime los datos que el usuario digito
		System.out.println("\nA continuacion se imprimiran los datos que tiene el arreglo:");
		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);

		}

	}

}
