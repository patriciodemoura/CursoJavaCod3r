package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		
				
		s = s.replace("X", "Senhora"); // substitui a palavra dentro da string
		s = s.toUpperCase(); // n�o altera o valor original // ap�s o replace para alterar a CAIXA 
		s = s.concat("!!!"); // concatenacao com a string
		
		System.out.println(s);
				
				
		
	}

}
