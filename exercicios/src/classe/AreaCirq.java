package classe;

public class AreaCirq {
	
	
	
	double raio;
	static final double pi = 3.14;
	
	AreaCirq(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
	
	
}