import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[7];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Digita el valor de la posicion " + i);

			numeros[i] = scanner.nextInt();
			
		}

		System.out.println("Datos ingresados del arreglo:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

		// Intercambiar valor de la posicion 3 con el de la posicion 5
		int auxiliar = numeros[3];

		numeros[3] = numeros[5];

		numeros[5] = auxiliar;

		System.out.println("Datos ingresados despues de intercambiar los valores de las posiciones 3 y 5");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

	}

}
