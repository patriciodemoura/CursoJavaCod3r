package fundamentos;

import java.util.Scanner;

public class MetodosNextintNextline {

	
public static void main(String[] args) {
	
	
	
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("qual a sua idade?");
	int idade = teclado.nextInt();
	teclado.nextLine(); // lê o que o teclado.nextIn() deixa para trás
	System.out.println("Qual o seu nome?");
	String nome = teclado.nextLine();
	System.out.println("qual o seu sobrenome?");
	String sobrenome = teclado.nextLine();
	
	System.out.println(" O seu nome é " + nome + " " + sobrenome +  " e você tem " + idade + " anos de idade");
	
	
	teclado.close();
}
		
	
	
}
