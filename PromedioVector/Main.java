import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digita el tamaño del vector:");
		int tamVector = scanner.nextInt();

		double[] numeros = new double[tamVector];

		double suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digita el valor de la posicion " + i);
			numeros[i] = scanner.nextDouble();
			suma += numeros[i];
		}

		double promedio = suma / numeros.length;

		System.out.println("El promedio de los numeros ingresados es " + promedio);

	}

}
