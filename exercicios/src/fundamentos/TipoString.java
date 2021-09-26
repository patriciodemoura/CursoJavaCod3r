package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
	// string objeto imutavel // pode ser substituida
		
		System.out.println("Ola pessoal".charAt(2)); //  charAt retorna um caractere especifico da String
		
		
		String s = "Boa tarde";
		System.out.println(s);
		System.out.println(s.concat("!!!")); // concatena a string
		System.out.println(s + "!!!"); // concatencao
		System.out.println(s.startsWith("Boa")); // inicia com a palavra boa \\ true or false
		System.out.println(s.toLowerCase().endsWith("TARDE")); // termina com a palavra indicada
		System.out.println(s.length()); // quantos caracteres tem uma string
		System.out.println(s.toLowerCase().equals("boa tarde")); // comparacao de igualdade
		System.out.println(s.equalsIgnoreCase("boa tarde")); // ignora as letras maaisculas e minusculas
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		
		System.out.println(nome + " " +  sobrenome + " " + "tem " + idade + " " + "anos "  + "e recebe R$ " +  salario + " de salário");
		
		
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario); //2f para indicar quantas casas decimais
		
		System.out.println(frase);
		
		
		System.out.println("frase qualquer".contains("qual")); // tem esta string
		System.out.println("frase qualquer".indexOf("qual")); // indice da palavra
		System.out.println("frase qualquer".substring(6)); // começa a partir do indice 6
		System.out.println("frase qualquer".substring(6, 8)); // mostra o caractere indicado no indice 6
		
		
		

	}

}
