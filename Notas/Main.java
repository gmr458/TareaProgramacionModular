import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digita la cantidad de notas");
		int cantidadNotas = scanner.nextInt();

		int[] notas = new int[cantidadNotas];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite la nota de la posicion: " + i);
	 		notas[i] = scanner.nextInt();
		}

		System.out.println("Digite el valor de nd");
		int nd = scanner.nextInt();
		
		System.out.println("Digite el valor de la posicion: " + nd);

		notas[nd] = scanner.nextInt();

		nd = nd + 1;

		System.out.println("Resultado final del arreglo:");

		for (int i = 0; i < nd; i++) {

			System.out.println(notas[i]);

		}

	}

}
