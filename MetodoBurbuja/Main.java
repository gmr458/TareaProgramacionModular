public class Main {

    public static void main(String[] args) {

        // Arreglo de numeros desordenado
        int[] a = {52, 14, 89, 17, 22, 84, 89, 78, 82, 29};
        //          0   1   2   3   4   5   6   7   8   9  <-  Posiciones
		
		// Imprimir arreglo desordenado
		System.out.println("Arreglo desordenado:");
		for (int i = 0; i < a.length; i++) {

			System.out.println("Posicion " + i + ": " + a[i]);
			
		}

        // Ordenar por el metodo burbuja
        // 1. Recorrer el arreglo tantas veces como elementos tenga menos 1
        // 2. En cada recorrido compara el elemento actual con el siguiente para
        // saber si estan ordenados, si no lo estan entonces lo ordenamos

        for (int recorrido = 0; recorrido < a.length - 1; recorrido++) {

            for (int elemento = 0; elemento < a.length - 1; elemento++) {

                // Si el elemento con indice actual es mayor que el elemento de indice actual menos 1 entonces
                // En pocas palabras esto significa si el elemento actual es mayor que el siguiente entonces
                if (a[elemento] > a[elemento + 1]) {

                    // Almacenamos en una variable temporal (t) el elemento con indice actual
                    int t = a[elemento];

                    // Intercambiamos el valor del elemento actual por el del elemento siguiente
                    a[elemento] = a[elemento + 1];

                    // Intercambiamos el valor del elemento siguiente por el del elemento actual,
                    // para esto nos sirve la variable temporal
                    a[elemento + 1] = t;
                }

            }

        }

		// Imprimir arreglo ordenado
		System.out.println("Arreglo ordenado:");
		for (int i = 0; i < a.length; i++) {

			System.out.println("Posicion " + i + ": " + a[i]);
			
		}

    }

}
