package controle;

public class Switch01 {

	
	public static void main(String[] args) {
		
		
		String faixa = "preta";
		
		
		switch (faixa.toLowerCase()) {
		
		case "preta":
		System.out.println("Sei o Bassai-Dai");
		case "marron":
			System.out.println("Sei Tekki-Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Meian-Iodan");
		case "laranja":
			System.out.println("Sei o Jiraya");
		case "vermelha":
			System.out.println("Sei o Jiban");
		case "amarela":
			System.out.println("Sei o Kakaroto");
		case "branca":
			System.out.println("Não sei nada");
		
		
		}
		
		
	}
}
