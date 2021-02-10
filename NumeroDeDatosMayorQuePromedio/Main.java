import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] notas = {20, 10, 15, 28, 25, 30, 12};

		int suma = 0;

		for (int i = 0; i < notas.length; i++) {

			suma += notas[i];

		}

		double promedio = suma / notas.length;

		int contador = 0;

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > promedio) {
				contador += 1;
			}

		}

		System.out.println("El numero de datos mayores al promedio son: " + contador);

	}

}
