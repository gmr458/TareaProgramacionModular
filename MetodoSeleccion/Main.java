public class Main {

	public static void main(String[] args) {

		// Arreglo
		int[] numeros = {7, 4, 2, 3, 5, 1, 6};

		// Imprimir arreglo desordenado
		System.out.println("Arreglo desordenado:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

		// Algoritmo del metodo de seleccion
		for (int i = 0; i < numeros.length; i++) {

			int minimo = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[minimo]) {

					minimo = j;

				}
				
			}

			int auxiliar = numeros[i];

			numeros[i] = numeros[minimo];

			numeros[minimo] = auxiliar;

		}
		
		// Imprimir arreglo ordenado
		System.out.println("Arreglo ordenado:");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + i + ": " + numeros[i]);
		}

	}

}
