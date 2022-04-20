import java.util.Scanner;
import java.util.Random;

public class teste3 {
	public static void main(String[] args) {
		String palavra1 = new String();
		String palavra2 = new String();
		int indiceVetor = 0;
		Scanner entradaTeclado = new Scanner(System.in);

		System.out.print("Entre com uma palavra : ");
		palavra1 = entradaTeclado.nextLine();

		char embaralhar[] = new char[palavra1.length()];

		tranformarChar(palavra1, indiceVetor, embaralhar);
		embaralharChar(palavra1, embaralhar, indiceVetor);
		palavra2 = novaPalavra(palavra1, embaralhar, indiceVetor);

		System.out.println("****Transformando em String*****");

		System.out.printf("" + palavra2);

	}

	static void tranformarChar(String palavra1, int indiceVetor, char embaralhar[]) {

		System.out.println("*****Tranformando em caracter*******");

		for (indiceVetor = 0; indiceVetor < palavra1.length(); indiceVetor++) {
			palavra1.getChars(0, palavra1.length(), embaralhar, 0);

			System.out.print(" " + embaralhar[indiceVetor]);

		}
	}

	static void embaralharChar(String palavra1, char embaralhar[], int indiceVetor) {
		char auxiliar;
		int vetorNumeroAleatorio1;

		System.out.println("");
		System.out.println("*****Embaralhando*******");

		for (indiceVetor = 0; indiceVetor < palavra1.length() / 2; indiceVetor++) {
			Random entradaAleatoria = new Random();

			vetorNumeroAleatorio1 = entradaAleatoria.nextInt(palavra1.length());

			auxiliar = embaralhar[indiceVetor];
			embaralhar[indiceVetor] = embaralhar[vetorNumeroAleatorio1];
			embaralhar[vetorNumeroAleatorio1] = auxiliar;

		}
	}

	static String novaPalavra(String palavra1, char embaralhar[], int indiceVetor) {
		String resultado = "";
		for (indiceVetor = 0; indiceVetor < palavra1.length(); indiceVetor++) {
			System.out.print(" " + embaralhar[indiceVetor]);
			resultado = resultado + embaralhar[indiceVetor];
		}
		System.out.println("");
		return resultado;
	}
}