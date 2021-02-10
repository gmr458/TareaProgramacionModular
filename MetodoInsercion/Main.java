public class Main {

	public static void main(String[] args) {

		// Arreglo
		int[] numeros = {7, 4, 2, 3, 5, 1, 6};

		// Imprimir arreglo desordenado
		System.out.println("Arreglo desordenado:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

        // Algoritmo del metodo de insercion
		for (int i = 0; i < numeros.length; i++) {

			int posicion = i;

			int auxiliar = numeros[i];

			while ((posicion > 0) && (numeros[posicion - 1] > auxiliar)) {

				numeros[posicion] = numeros[posicion - 1];

				posicion--;

			}

			numeros[posicion] = auxiliar;

		}

		// Imprimir arreglo ordenado
		System.out.println("Arreglo ordenado:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

	}

}
