package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o numero:"); // painel e seu m�todo

		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {

			System.out.println("Numero par");

		} else {

			System.out.println("numero impar");
		}

	}

}
