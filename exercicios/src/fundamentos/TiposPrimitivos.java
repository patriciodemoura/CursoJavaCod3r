package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
	// informa��es do funcion�rio
		
	// tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // literal long
		
		
	// Tipos num�ricos reais
		
		float salario = 11_445.44F; // literal float
		double vendasAcumuladas = 2_991_797_103.013;
		
		
	// Tipo booleano
		boolean estaDeFerias = false; // true
		
	// Tipo caractere
		char status = '?'; // ativo
		
		
	// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
	// N�mero de viagens
		
		System.out.println(numeroDeVoos / 2);
		
	// Pontos por real
		
		System.out.println();
		
		System.out.println (pontosAcumulados / vendasAcumuladas);
		
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias?" + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
