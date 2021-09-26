package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();

		switch (nota) {

		case 10:
			conceito = "A";
			break;
		case 9:
			conceito = "A";

		case 8:
			conceito = "B";
			break;
		case 7:
			conceito = "B";
		case 6:
			conceito = "C";
			break;
		case 5:
			conceito = "C";
		case 4:
			conceito = "D";
			break;
		case 3:
			conceito = "D";
		case 2:
			conceito = "E";
			break;
		case 1:
			conceito = "E";
			break;
		default:
			conceito = "não informado";

		}

		System.out.println("Conceito é " + conceito);

		entrada.close();

	}

}
