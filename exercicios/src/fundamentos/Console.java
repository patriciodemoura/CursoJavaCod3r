package fundamentos;


import java.util.Scanner;

public class Console {
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.print("Bom ");
		System.out.print("dia");
		
		System.out.println("Bom dia");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("salario: %.1f%n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:  ");
		String nome  = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome  ");
		String sobrenome  = entrada.nextLine();
		
		System.out.print("Digite sua idade:  ");
		int idade = entrada.nextInt();
		
		System.out.println("\n\nNomeCompleto = " + nome + " " + sobrenome);
		
		System.out.printf("%s %s  tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close(); // fechar o scanner
		
	}

}
