import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digita el tamaño del vector:");
		int tamVector = scanner.nextInt();

		int[] numeros = new int[tamVector];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digita el valor de la posicion " + i);
			numeros[i] = scanner.nextInt();
		}

		System.out.println("Digite el numero que sumara a cada una de las posicinoes del vector");
		int numero = scanner.nextInt();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] += numero;
		}

		System.out.println("Vector resultante");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

	}

}
