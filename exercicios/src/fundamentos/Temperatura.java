package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (°F - 32) X 5/9 = °C
		
		
		double F = 86;
		final double ajuste = 32;
		final double calculo = 5.0 / 9.0;
		
		double Celsius = (F - ajuste) * calculo;
		
		System.out.println(Celsius);
		
	}

}
