package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double valorPagar(double cotacaoDolar, double quantDolar) {
		return cotacaoDolar * (1.0 + IOF) * quantDolar;
	}
}
