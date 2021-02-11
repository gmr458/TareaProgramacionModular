import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

		System.out.println("Arreglo");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

		System.out.println("Digita el numero que agregaras");
		int numAgregado = scanner.nextInt();

		System.out.println("Digita la posicion en la que lo agregaras");
		int posicion = scanner.nextInt();

		for (int i = 0; i < numeros.length; i++) {
			if (i == posicion) { 
				numeros[posicion] = numAgregado;
			}
		}

		System.out.println("Arreglo final:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

	}

}
